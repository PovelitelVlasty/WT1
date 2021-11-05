package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task2 class
 */
public class Task2 {
    /**
     * Input x value
     * @return int
     */
    public static int inputX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x: ");
        return scanner.nextInt();
    }

    /**
     * Input y value
     * @return int
     */
    public static int inputY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input y: ");
        return scanner.nextInt();
    }

    /**
     * Check point to belong the area
     * @param x - x coordinate
     * @param y - y coordinate
     * @return boolean
     */
    public static boolean checkPoint(int x, int y) {
        boolean isBelongsTopArea = ((x >= -4) && (x <= 4)) && ((y >= 0) && (y <= 5));
        boolean isBelongsBottomArea = ((x >= -6) && (x <= 6)) && ((y >= -3) && (y <=0));

        return isBelongsTopArea || isBelongsBottomArea;
    }

    /**
     * Print results
     */
    public static void printResult() {
        if (checkPoint(inputX(), inputY())) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Task 2-----");
        printResult();
    }
}
