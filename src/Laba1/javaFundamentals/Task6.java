package Laba1.javaFundamentals;

import java.util.Scanner;


public class Task6 {
    
    public static int inputN() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input N: ");
        return scan.nextInt();
    }

    
    public static int[] inputArray(int size) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input numbers: ");

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    
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

    
    public static void printResult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        int[] array = inputArray(inputN());
        int[][] matrix = createMatrix(array);

        System.out.println("-----Task 6-----");
        printResult(matrix);
    }
}
