package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "grape", "apricot");

        // 1. Find red fruits (apple, cherry, apricot)
        List<String> redFruits = fruits.stream()
                .filter(fruit -> fruit.equals("apple") || fruit.equals("cherry") || fruit.equals("apricot"))
                .collect(Collectors.toList());

        System.out.println("Red Fruits: " + redFruits); // Output: [apple, cherry, apricot]

        // 2. Get the names of all fruits in uppercase
        List<String> uppercaseFruits = fruits.stream()
                .map(String::toUpperCase) // Convert each fruit name to uppercase
                .collect(Collectors.toList());

        System.out.println("Uppercase Fruits: " + uppercaseFruits); // Output: [APPLE, BANANA, CHERRY, GRAPE, APRICOT]

        // 3. Combine the operations: Red fruits in uppercase
        List<String> redFruitsUppercase = fruits.stream()
                .filter(fruit -> fruit.equals("apple") || fruit.equals("cherry") || fruit.equals("apricot"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Red Fruits (Uppercase): " + redFruitsUppercase); // Output: [APPLE, CHERRY, APRICOT]


        //4. Count of red fruits
        long countOfRedFruits = fruits.stream()
                .filter(fruit -> fruit.equals("apple") || fruit.equals("cherry") || fruit.equals("apricot"))
                .count();

        System.out.println("Count of Red Fruits (Uppercase): " + countOfRedFruits); // Output: 3
    }
}
