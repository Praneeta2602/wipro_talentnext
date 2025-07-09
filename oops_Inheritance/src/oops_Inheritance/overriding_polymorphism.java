package oops_Inheritance;

class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

public class overriding_polymorphism {
    public static void main(String[] args) {
        // Create objects and observe polymorphism
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        // Call draw() and erase() methods
        c.draw();
        c.erase();

        System.out.println();

        t.draw();
        t.erase();

        System.out.println();

        s.draw();
        s.erase();
    }
}
