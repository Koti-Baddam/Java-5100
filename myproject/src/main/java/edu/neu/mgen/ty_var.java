package edu.neu.mgen;
import java.util.Scanner;

public class ty_var {
    /**
 * @param args
 */
@SuppressWarnings("unused")
public static void main(String[] args) {
        System.out.println("Hello World");

        // Declare and initialize integer variables 2 each 
        int intV1 = 54; 
        int intV2 = 67;
        long longV1 = 9948L; 
        long longV2 = 837735L;
	// Declare and initialize double variables 2 each 
        double doubleV1 = 364.559; 
        double doubleV2 = 512.718;
	// Declare and initialize boolean variables
        boolean booleanV1 = true; 
        boolean booleanV2 = false;
	// Declare and initialize character variables
        char letter1 = 'K'; 
        char letter2 = 'B';

	// Convert long to int
        intV2 = (int) longV2;
        System.out.println("Converted long to int: " + intV2);

        // Convert int to long
        longV1 = intV1; 
        System.out.println("Converted int to long: " + longV1);

        

        // Input values for variables from the terminal
        Scanner scanner = new Scanner(System.in);
        System.out.print("input for doubleV1= ");
        doubleV1 = scanner.nextDouble();
        System.out.print("input for doubleV2= ");
        doubleV2 = scanner.nextDouble();

        // Arithmetic operations
        System.out.println("product of intV1 and intV2: " + (intV1 * intV2));
        System.out.println("Difference of longV1 and longV2: " + (longV1 - longV2));
        System.out.println("sum of doubleV1 and doubleV2: " + (doubleV1 + doubleV2));

        // Logical operations
        System.out.println("Logical AND of booleanV1 and booleanV2: " + (booleanV1 && booleanV2));
        System.out.println("Logical OR of booleanV1 and booleanV2: " + (booleanV1 || booleanV2));
        System.out.println("Logical NOT of booleanVar1: " + booleanV1);
        scanner.close();

}
}
