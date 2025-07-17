package ioStreams;
import java.io.*;
import java.util.*;
public class I_O_stream_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get file name and character input
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        System.out.println("Enter the character to be counted:");
        char targetChar = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }
            System.out.printf("File '%s' has %d instances of letter '%c'.%n", fileName, count, targetChar);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
	}

}