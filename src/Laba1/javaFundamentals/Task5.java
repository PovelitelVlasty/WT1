package Laba1.javaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task 5 class
 */
public class Task5 {
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
     * Get the number of extracted numbers from sequence
     * @param sequence - source sequence
     * @return int
     */
    private static int getExtractedNumbersCount(int[] sequence) {
        if (sequence.length == 1) {
            return 0;
        }

        int[] lengthOfSubsequence = new int[sequence.length];

        Arrays.fill(lengthOfSubsequence, 1);

        for (int i = 1; i < sequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    if (lengthOfSubsequence[i] <= lengthOfSubsequence[j]) {
                        lengthOfSubsequence[i] = lengthOfSubsequence[j] + 1;
                    }
                }
            }
        }

        int maximum = Arrays.stream(lengthOfSubsequence).max().getAsInt();

        return sequence.length - maximum;
    }

    /**
     * Print results
     */
    public static void printResult() {
        int[] sequence = inputArray(inputN());

        System.out.println("Minimum number of extracted elements: " + getExtractedNumbersCount(sequence));
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Task 5-----");
        printResult();
    }
}
