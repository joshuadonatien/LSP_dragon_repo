package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word_Count {

	public static void main(String[] args) {
        // Path to the input file
		String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";
        
        // Call method to count words
        Map<String, Integer> wordCount = countWords(filePath);

        // Display the results
        System.out.println("Word Count: ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String filePath) {
        // Map to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            // Reading the file
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Loop through each line in the file
            while (scanner.hasNextLine()) {
                // Read the line and split into words
                String line = scanner.nextLine();

                // Clean the line by removing non-letter characters and convert to lowercase
                String[] words = line.toLowerCase().split("[^a-z]+");

                for (String word : words) {
                    // Skip trivial words with 3 or fewer letters
                    if (word.length() <= 3) {
                        continue;
                    }

                    // Increment the word count in the map
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        return wordCount;
    }
}