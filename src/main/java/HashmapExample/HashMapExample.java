package HashmapExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        // Put (store) key-value pairs
        ages.put("Alice", 300);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        ages.put("Alice21", 80);
        ages.put("Bob4", 60);
        ages.put("Charlie8", 350);
        HashMap<String, Integer> Hello = new HashMap<>();
        List<Integer> p = ages.values().stream().filter(k->k>20).collect(Collectors.toList());
        System.out.println(p);
    }
}

//
//        // Get (retrieve) a value using its key
//        int aliceAge = ages.get("Alice");  // Access using the key "Alice"
//        System.out.println("Alice's age: " + aliceAge); // Output: 30
//        // HashMap does not allow duplicate keys
//        ages.put("Alice", 32); // This will update the value associated with the key "Alice"
//        aliceAge = ages.get("Alice");
//        System.out.println("Alice's age: " + aliceAge); // Output: 32
//
//        // Iterating over the HashMap (entries)
//        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
//            String name = entry.getKey();
//            int age = entry.getValue();
//            System.out.println(name + ": " + age);
//        }
//
//        // Iterating over the HashMap (keys)
//        for (String name : ages.keySet()) {
//            System.out.println("Name: " + name);
//        }
//
//        // Iterating over the HashMap (values)
//        for (Integer age : ages.values()) {
//            System.out.println("Age: " + age);
//        }
//
//        // Check if a key exists
//        boolean hasKey = ages.containsKey("Bob"); // Output: true
//        System.out.println("Has Bob's age? " + hasKey);
//
//        // Remove an entry
//        ages.remove("Bob");
//
//        // Check the size
//        int size = ages.size();
//        System.out.println("Size of HashMap: " + size); // Output: 2
//
//    }
   // }
//}