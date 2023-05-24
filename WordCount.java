//Write Java Program to find the number of the words in the given text file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            // Specify the path to the text file
            String filePath = "file.txt";

            // Create a File object
            File file = new File(filePath);

            // Create a Scanner to read the file
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            // Iterate through each word in the file
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            // Close the Scanner
            scanner.close();

            System.out.println("Number of words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
