package Laba1.javaFundamentals;

import java.util.Scanner;

/**
 * Task3 class
 */
public class Task3 {
    /**
     * Input left bound
     * @return double
     */
    public static double inputA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        return scanner.nextDouble();
    }

    /**
     * Input right bound
     * @return double
     */
    public static double inputB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input b: ");
        return scanner.nextDouble();
    }

    /**
     * Input step value
     * @return double
     */
    public static double inputH() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input h: ");
        return scanner.nextDouble();
    }

    /**
     * Calculate function within [a,b] with step h
     * @param a - left bound
     * @param b - right bound
     * @param h - step
     */
    private static void calculateFunction(double a, double b, double h) {
        double x = a;
        double eps = h / 1000;

        if ((a < b) && (h > 0) || (a > b) && (h < 0)) {
            if (h > 0) {
                while (x < b) {
                    System.out.printf("%5.3f\t%5.3f\n", x, Math.tan(x));
                    x += h;
                }
            }
            else if (h < 0) {
                while (x > b) {
                    System.out.printf("%5.3f\t%5.3f\n", x, Math.tan(x));
                    x += h;
                }
            }
        }
        else {
            System.out.printf("%5.3f\t%5.3f\n", a, Math.tan(a));
        }

        if ((x - h - b > eps) || (h == 0)) {
            System.out.printf("%5.3f\t%5.3f\n", b, Math.tan(b));
        }
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Task 3-----");
        calculateFunction(inputA(), inputB(), inputH());
    }
}
