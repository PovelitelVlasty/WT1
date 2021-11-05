package Laba1.javaFundamentals;

import java.util.Scanner;


public class Task4 {
    
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

    
    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {
        System.out.println("-----Task 4-----");
        printResult();
    }
}
