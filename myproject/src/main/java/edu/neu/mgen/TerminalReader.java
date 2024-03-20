package edu.neu.mgen;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TerminalReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(reader.readLine());

            System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(reader.readLine());

            int result = numerator / denominator;
            System.out.println("The result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please try again with a valid denominator.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure you enter numeric values.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred while reading input.");
        }
        
        System.out.println("The program has ended.");
    }
}

