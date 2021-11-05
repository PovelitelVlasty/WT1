package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task4 class
 */
public class Task4 {
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
     * Print results
     */
    public static void printResult() {
        int[] array = inputArray(inputN());

        boolean havePrimes = false;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                if (!havePrimes) {
                    System.out.print("Indices of primes: ");
                    System.out.print(i);
                    havePrimes = true;
                }
                else {
                    System.out.print(", " + i);
                }
            }
        }

        if (!havePrimes) {
            System.out.println("There are no primes!");
        }
    }

    /**
     * Check the number for simplicity
     * @param number - number
     * @return boolean
     */
    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Task 4-----");
        printResult();
    }
}
