package StreamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateHashMapStreamFlatMap {
    public static void main(String[] args) {
        // ... (map1, map2, listOfMaps as in the previous example)
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("c", 3);
        map2.put("d", 4);

        List<HashMap<String, Integer>> listOfMaps = List.of(map1, map2);
        Stream<HashMap<String, Integer>> streamOfMaps = listOfMaps.stream();

        streamOfMaps.flatMap(map -> map.entrySet().stream()) // FlatMap to entries
                .forEach(entry -> {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                });

        List<String> a= Arrays.asList("Cpphhhhhle","Eanana","Aanago");
        List<String> b=a.stream().sorted().collect(Collectors.toList());
        System.out.println(b);

    }
}
