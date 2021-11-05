package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task6 class
 */
public class Task6 {
    /**
     * Input array size
     * @return int
     */
    public static int inputN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");
        return scanner.nextInt();
    }

    /**
     * Input array
     * @param size - size of array
     * @return int[]
     */
    public static int[] inputArray(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numbers: ");

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    /**
     * Create square matrix from the array
     * @param array - source array
     * @return int[][]
     */
    private static int[][] createMatrix(int[] array) {
        int[][] matrix = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            int k = 0;
            for (int j = i; j < array.length; j++) {
                matrix[i][k] = array[j];
                k++;
            }

            for (int j = 0; j < i; j++) {
                matrix[i][k] = array[j];
                k++;
            }
        }

        return matrix;
    }

    /**
     * Print results
     * @param matrix - result matrix
     */
    public static void printResult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        int[] array = inputArray(inputN());
        int[][] matrix = createMatrix(array);

        System.out.println("-----Task 6-----");
        printResult(matrix);
    }
}
