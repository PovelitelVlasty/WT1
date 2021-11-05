package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task 1 class
 */
public class Task1 {
    /**
     * Input x value
     * @return double
     */
    public static double inputX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x: ");
        return scanner.nextDouble();
    }

    /**
     * Input y value
     * @return double
     */
    public static double inputY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input y: ");
        return scanner.nextDouble();
    }

    /**
     * Calculate value of function
     * @param x - x value
     * @param y - y value
     * @return double - function result
     */
    public static double calculateFunction(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x * y, 2)));

        return numerator / denominator + x;
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Task 1-----");
        System.out.println("Function result: " + calculateFunction(inputX(), inputY()));
    }
}
