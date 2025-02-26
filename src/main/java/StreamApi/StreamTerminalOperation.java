package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Reduction: Summing numbers
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Collection: Collecting into a List
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers); // Output: Even numbers: [2, 4]

        // Matching: Checking if any number is greater than 4
        boolean anyGreaterThanFour = numbers.stream().anyMatch(n -> n > 4);
        System.out.println("Any greater than 4: " + anyGreaterThanFour); // Output: Any greater than 4: true

        // Side-effect: Printing numbers
        numbers.stream().forEach(System.out::println);
    }
}


