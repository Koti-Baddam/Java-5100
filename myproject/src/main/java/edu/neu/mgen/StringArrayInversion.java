package edu.neu.mgen;
public class StringArrayInversion {

    public static void main(String[] args) {
        // First array of strings
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        // Second array of strings
        String[] array2 = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};

        // Process and print the first array
        System.out.println("Original array:\n");
        printArray(array1);
        String[] resultArray1 = invertAndReverseArray(array1);
        System.out.println("\nResultant array:\n");
        printArray(resultArray1);

        // Process and print the second array
        System.out.println("Original array:\n");
        printArray(array2);
        String[] resultArray2 = invertAndReverseArray(array2);
        System.out.println("\nResultant array:\n");
        printArray(resultArray2);
    }

    // Method to invert the array and reverse each string
    public static String[] invertAndReverseArray(String[] array) {
        String[] invertedArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            // Reverse the string and capitalize the first letter while making others lowercase
            invertedArray[array.length - 1 - i] = new StringBuilder(array[i]).reverse().toString().toLowerCase();
            invertedArray[array.length - 1 - i] = Character.toUpperCase(invertedArray[array.length - 1 - i].charAt(0)) 
                                                  + invertedArray[array.length - 1 - i].substring(1);
        }

        return invertedArray;
    }

    // Utility method to print elements of the array
    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println("\"" + element + "\",");
        }
        System.out.println("End of the array\n");
    }
}
