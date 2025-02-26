package StreamApi;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ItterteHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("c", 3);
        map2.put("d", 4);

        List<HashMap<String, Integer>> listOfMaps = List.of(map1, map2);

        Stream<HashMap<String, Integer>> streamOfMaps = listOfMaps.stream();

        streamOfMaps.forEach(map -> {
            // Iterate over the entries of each individual map
            map.forEach((key, value) -> {
                System.out.println("Key: " + key + ", Value: " + value);
            });
            System.out.println("---"); // Separator between maps
        });
    }
}