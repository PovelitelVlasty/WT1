package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task8 class
 */
public class Task8 {
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
     * Merge two array into one
     * @param array1 - first array
     * @param array2 - second array
     * @return int[]
     */
    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, resultArray, 0, array1.length);
        System.arraycopy(array2, 0, resultArray, array1.length, array2.length);

        return resultArray;
    }

    /**
     * Find positions of insertion places
     * @param sequence2 - second sequence
     * @param mergedSequence - merged sequence
     * @return int[]
     */
    private static int[] findPositions(int[] sequence2, int[] mergedSequence) {
        int[] positions = new int[sequence2.length];
        int k = 0;

        for (int i = 0; i < sequence2.length; i++) {
            for (int j = 0; j < mergedSequence.length; j++) {
                if (mergedSequence[j] == sequence2[i]) {
                    positions[k++] = j;
                    break;
                }
            }
        }

        return positions;
    }

    /**
     * Print results
     * @param array - result array
     */
    public static void printResult(int[] array) {
        System.out.println("Indices of inserted elements: ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Task 8-----");
        System.out.println("-----Input first sequence------");
        int[] sequence1 = inputArray(inputN());

        System.out.println("-----Input second sequence-----");
        int[] sequence2 = inputArray(inputN());

        int[] mergedSequence = mergeArrays(sequence1, sequence2);
        sortArray(mergedSequence);

        int[] positions = findPositions(sequence2, mergedSequence);
        printResult(positions);
    }
}
