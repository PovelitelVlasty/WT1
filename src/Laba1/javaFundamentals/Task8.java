package Laba1.javaFundamentals;

import java.util.Scanner;


public class Task8 {
    
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

    
    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, resultArray, 0, array1.length);
        System.arraycopy(array2, 0, resultArray, array1.length, array2.length);

        return resultArray;
    }

    
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

    
    public static void printResult(int[] array) {
        System.out.println("Indices of inserted elements: ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    
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
