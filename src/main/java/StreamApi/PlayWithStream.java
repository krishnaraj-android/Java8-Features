package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class PlayWithStream {
    public static <Int> void main(String[] args) {
        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");

        List<Integer> SplitedLengthValue= words.stream().map(String::length).collect(toList());
        System.out.println(SplitedLengthValue);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);



//        List<Integer[]> pairs = numbers1.stream().
//                flatMap(i -> numbers2.stream()
//                        .map(j -> new Integer[]{i, j}) // Wrap ints in Integer objects
//                )
//                .collect(toList());

   //    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        Integer[] numbers = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // Convert the array to a List for easier stream operations
        List<Integer> numberList = Arrays.asList(numbers);

        // Sort, skip, and find max using streams
        Optional<Integer> max = numberList.stream()
                .sorted((a,b)->b-a) // Sort the list in ascending order
                .skip(2)   // Skip the first two elements
                .max(Comparator.naturalOrder()); // Find the maximum element

        System.out.println(max);

// try using hashmap. itterate using its keyValue stream then map


    }
}
