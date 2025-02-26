import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {
        ArrayList<Integer> sal = new ArrayList<>();
        sal.add(10);
        sal.add(20);
        sal.add(40);
        sal.add(50);
        sal.add(60);

        sal.stream().sorted().forEach(System.out::println);

    }
}
