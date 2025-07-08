package oops_Inheritance;

class Box {
    double width;
    double height;
    double depth;

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }
}

public class oopsquestion1 {
    public static void main(String[] args) {
        // Create Box object using parameterized constructor
        Box myBox = new Box(5.0, 3.0, 2.0);

        // Get and display the volume
        double volume = myBox.getVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
