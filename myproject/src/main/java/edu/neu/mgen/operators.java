package edu.neu.mgen;
import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis(); // startTime 
        System.out.print("Enter any word:");
        word=scanner.nextLine();
        int wordLength = word.length();
        long endTime = System.currentTimeMillis(); // endTime
        long recationTime = endTime - startTime;
        if (word.trim().isEmpty()) {
            System.out.println("You did not enter any word"); // no word entered
            System.exit(0);
        }
        String classify;  // classification
        if (wordLength <= 5) {
            classify = "short";
        } else if (wordLength <= 10) {
            classify = "medium";
        } else {
            classify = "long";
        }
        System.out.println("Your word is "+word);
        System.out.println("The length of the word " +wordLength);
        System.out.println("It is "+classify+ " word");
        System.out.println("Your reaction time " +recationTime + " in seconds");
        scanner.close();
    }
}
