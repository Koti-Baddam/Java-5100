package edu.neu.mgen;

public class string {
    public static void main(String[] args) {
        String name = "Oakland"; 
        char i2 = name.charAt(2);
        System.out.println("String Length=" + name.length()); // length() mehtod used to find length of given string
        System.out.println("Character of string with index-" + i2); // prints a character with index 2 in the string.
        System.out.println("Print Substring :" + name.subSequence(3,7)); // Substring 
        System.out.println("Upper Case String -- " + name.toUpperCase()); // Given Input is converted to Upper Case

    }
}
