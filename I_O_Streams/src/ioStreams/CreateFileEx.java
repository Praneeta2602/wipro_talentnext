package ioStreams;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileEx {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Input.txt")) {
            writer.write("This is a sample file with several occurrences of the letter R and r.");
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}