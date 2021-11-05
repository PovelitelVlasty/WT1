package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task7 class
 */
public class Task7 {
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
     * Sort the array by Gnome sort
     * @param array - source array
     */
    private static void sortArray(int[] array) {
        int i = 1;

        while (i < array.length) {
            if (array[i - 1] <= array[i]) {
                i++;
            }
            else {
                int tmp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmp;
                i--;

                if (i == 0) {
                    i++;
                }
            }
        }
    }

    /**
     * Print results
     * @param array - result array
     */
    public static void printResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        int[] array = inputArray(inputN());

        System.out.println("-----Task 7-----");
        sortArray(array);
        printResult(array);
    }
}
