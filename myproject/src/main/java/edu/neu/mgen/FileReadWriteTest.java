package edu.neu.mgen;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteTest {

    private static final String FILE_PATH = "my_test_file.txt";

    public static void main(String[] args) {
        // Step 1 & 2: Read from the file and print its contents
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String currentLine;

            System.out.println("Reading from file:");
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Step 3: Get input from user in the Java terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase to append to the file:");
        String inputText = scanner.nextLine();
        scanner.close();

        try {
            FileWriter writer = new FileWriter(FILE_PATH, true); // Append mode is enabled by passing true
            writer.write("\n" + inputText); 
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }
}
