package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Formattable;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true,530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

       List<String> names =menu.parallelStream()
               .filter(d->d.getCalories()>700)
               .map(Dish->Dish.getName()).limit(3).collect(toList());
        System.out.println(names);

        long count= menu.stream()
                //.filter(d->d.getCalories()>100)
                .distinct()
                .count();
        System.out.println(count);


        Comparator<Dish> n = Comparator.comparing(dish -> dish.getCalories());
        System.out.println(n);


//        List<String> m = new ArrayList<>();
//        for(Dish d: menu){
//            m.add(d.getName());
//            System.out.println(m);
//        }
//        System.out.println(m);

    }};

//.stream() return type Stream<Dish>
//.Filter() return type Stream<Dish>
//.map()  return type Stream<String>
// means storage will of that type. like in above code at last map return type String of List.

//int[] nums = {1, 2, 3};
//List<int[]> intList = Arrays.asList(nums); // Creates a List with ONE element: the entire int[]
//System.out.println(intList.size()); // Output: 1
//System.out.println(intList.get(0)); // Prints the array itself (something like [I@76ed5528)

//// To get a List of individual ints, you'd need:
//Integer[] numsWrapped = {1, 2, 3};
//List<Integer> intListCorrect = Arrays.asList(numsWrapped); // Now works as expected