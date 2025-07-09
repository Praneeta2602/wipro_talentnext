package oops_Inheritance;

class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is pecking food.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping on a tree.");
    }

    public void fly() {
        System.out.println("Bird is flying in the sky.");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        // Instance of Animal
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println();

        // Instance of Bird
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
