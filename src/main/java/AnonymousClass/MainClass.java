package AnonymousClass;

class MyClass { // Constructor is here, inside the class
    String name;
    int age;

    public MyClass(String theName, int theAge) {
        name = theName;
        age = theAge;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MainClass { // Main method is here, in a separate class (or same class)
    public static void main(String[] args) {
        MyClass obj = new MyClass("Alice", 30); // Creating an object of MyClass
        obj.display();
    }
}

//Constructors are associated with classes, and
// they are defined within the class definition, not within methods like main.