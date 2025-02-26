package InterfaceExample;

interface MyInterface {
    void myMethod();
}

class AnyClass implements MyInterface { // MyClass implements MyInterface
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
}

public class MyClass {
    public static void main(String[] args) {
        MyInterface obj = new AnyClass(); // Create an object of the implementing class
        obj.myMethod(); // Call the interface method
    }
}