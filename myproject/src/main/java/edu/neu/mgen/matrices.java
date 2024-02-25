package edu.neu.mgen;
public class matrices {
    public static void main(String[] args) {
        int[][] A = {{2, 3, 4},{3, 4, 5}};
        int[][] B = {{1, 2},{3, 4},{5, 6}};
        int numRowsA = A.length;
        int numColsA = A[0].length;
        int numRowsB = B.length;
        int numColsB = B[0].length;
        // Check if matrices can be multiplied
        if (numColsA != numRowsB) {
            System.out.println("Matrices cannot be multiplied.");
        } else {
            // Initialize the result matrix C
            int[][] C = new int[numRowsA][numColsB];

            // Matrix multiplication using loops
            for (int i = 0; i < numRowsA; i++) {
                for (int j = 0; j < numColsB; j++) {
                    for (int k = 0; k < numColsA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            // Output the result
            System.out.println("Product of matrices A and B:");
            for (int i = 0; i < numRowsA; i++) {
                for (int j = 0; j < numColsB; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
