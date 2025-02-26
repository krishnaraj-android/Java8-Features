package AnonymousClass.Constructor;

class OuterClass2 {
    private String outerName = "Outer"; // Instance variable of the outer class

    class InnerClass { // Non-static nested class
        public void innerMethod() {
            System.out.println("Inner method, outerName = " + outerName); // Accessing outer class member
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass2 outerObj = new OuterClass2(); // First, create an instance of the outer class
        OuterClass2.InnerClass innerObj = outerObj.new InnerClass(); // Then, create an instance of the inner class using the outer instance.
        innerObj.innerMethod();
    }
}