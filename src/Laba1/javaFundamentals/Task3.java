package Laba1.javaFundamentals;

import java.util.Scanner;

public class Task3 {
    
    public static double inputA() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        return scan.nextDouble();
    }

    
    public static double inputB() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input b: ");
        return scan.nextDouble();
    }

    
    public static double inputH() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input h: ");
        return scan.nextDouble();
    }

    
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

    
    public static void main(String[] args) {
        System.out.println("-----Task 3-----");
        calculateFunction(inputA(), inputB(), inputH());
    }
}
