package StreamApi;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class OptionalContainer {
    public static void main(String[] args) {

        List<Integer> someNumbers = Arrays.asList();
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream().
                map(x -> x * x).filter(x->x%3==0).findFirst();
        System.out.println(firstSquareDivisibleByThree);

        List<Integer> numbers=Arrays.asList(1,2,3);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> (a + b));
        System.out.println(sum);

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5);



    }

}
