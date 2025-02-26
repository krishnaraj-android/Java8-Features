package AnonymousClass;

interface MyInterface1 {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default implementation");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }
}

class MyClass1 implements MyInterface1 {
    @Override
    public void abstractMethod() {
        System.out.println("MyClass implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        // Output: Default implementation
        MyInterface1.staticMethod(); // Output: Static method
    }
}