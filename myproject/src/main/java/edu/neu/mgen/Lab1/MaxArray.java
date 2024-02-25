package edu.neu.mgen.Lab1;
public class MaxArray {
    public static void main(String[] args) {
        int[] x = {5, 10, 15, 20, 25};
        int[] y = {3, 12, 9, 18, 6};
        int[] z = new int[5];

        // Calculate the max of respective numbers from arrays x and y
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print array x
        System.out.print("Array x = {");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Print array y
        System.out.print("Array y = {");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Print array z
        System.out.print("Array z = x + y = {");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
