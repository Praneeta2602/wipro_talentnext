package ioStreams;

import java.io.*;
import java.util.*;

public class FileWordCountQ {
    public static void main(String[] args) {
        String inputFile = "inputFile.txt";
        String outputFile = "outputFile.txt";

        // Step 1: Create and write to input file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Manoj works at Wipro\n");
            writer.write("Katari works at Wipro\n");
            writer.write("Sureka works at Wipro\n");
            writer.write("Harish works at Wipro\n");
            writer.write("Anitha works at Wipro\n");
            writer.write("Janani works at Wipro\n");
            System.out.println("Input file created and populated.");
        } catch (IOException e) {
            System.out.println("Error creating input file: " + e.getMessage());
            return;
        }

        // Step 2: Read input file and count word occurrences
        Map<String, Integer> wordCountMap = new TreeMap<>(); // TreeMap for alphabetical sorting

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.trim();
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Step 3: Write word counts to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Output file created with word counts.");
        } catch (IOException e) {
            System.out.println("Error writing output file: " + e.getMessage());
        }
    }
}