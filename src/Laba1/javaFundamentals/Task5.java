package Laba1.javaFundamentals;

import java.util.Arrays;
import java.util.Scanner;


public class Task5 {
    
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

    
    public static void printResult() {
        int[] sequence = inputArray(inputN());

        System.out.println("Minimum number of extracted elements: " + getExtractedNumbersCount(sequence));
    }

    
    public static void main(String[] args) {
        System.out.println("-----Task 5-----");
        printResult();
    }
}
