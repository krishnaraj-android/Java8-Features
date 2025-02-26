package InterfaceExample;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class NornamalInterface {
    public static void main(String[] args) {
        Drawable shape1 = new Circle();
        Drawable shape2 = new Square();

        shape1.draw();
        drawShape(shape1); // Output: Drawing a circle
        drawShape(shape2); // Output: Drawing a square
    }

    public static void drawShape(Drawable d) {  // Polymorphism!
        d.draw();
    }
}
//This example illustrates how interfaces enable abstraction, polymorphism,
// and flexibility in your code. They are a fundamental tool for writing
// well-structured, maintainable, and extensible Java applications.