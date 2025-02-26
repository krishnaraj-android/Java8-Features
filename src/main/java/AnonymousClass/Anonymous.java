package AnonymousClass;
interface MyInterface {
    void myMethod();
}

public class Anonymous {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() { // Anonymous inner class definition here
            @Override
            public void myMethod() {
                System.out.println("Anonymous inner class implementation");
            }
        }; // Note the semicolon here.
        obj.myMethod();
    }
}

/*

//Lambda Expressions (Shorter version of anonymous inner classes):
// Functional Interface (only one abstract method)
interface MyInterface {
    void myMethod();
}

public class MainClass {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Lambda implementation"); // Lambda expression
        obj.myMethod();
    }
}
*/