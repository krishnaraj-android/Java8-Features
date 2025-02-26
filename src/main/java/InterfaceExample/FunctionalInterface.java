package InterfaceExample;

interface MyMath {
        int operate(int a, int b);
    }

    public class FunctionalInterface {
        public static void main(String[] args) {
            // Lambda expression for addition and  Anonymous inner class.
            MyMath add = (a, b) -> a + b;
            System.out.println("Sum: " + add.operate(10, 3)); // Output: Sum: 8

            // Lambda expression for multiplication
            MyMath multiply = (a, b) -> a * b;
            System.out.println("Product: " + multiply.operate(5, 3)); // Output: Product: 15
        }
    }


//A functional interface is an interface with only one abstract method.
// Lambda expressions can be used to provide implementations for functional interfaces.