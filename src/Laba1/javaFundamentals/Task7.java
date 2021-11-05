package Laba1.javaFundamentals;

import java.util.Scanner;


public class Task7 {
    
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

    
    public static void printResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    
    public static void main(String[] args) {
        int[] array = inputArray(inputN());

        System.out.println("-----Task 7-----");
        sortArray(array);
        printResult(array);
    }
}
