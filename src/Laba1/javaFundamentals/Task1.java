package Laba1.javaFundamentals;

import java.util.Scanner;


public class Task1 {
    
    public static double inputX() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        return scan.nextDouble();
    }

    
    public static double inputY() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input y: ");
        return scan.nextDouble();
    }

    
    public static double calculateFunction(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x * y, 2)));

        return numerator / denominator + x;
    }

    
    public static void main(String[] args) {
        System.out.println("-----Task 1-----");
        System.out.println("Function result: " + calculateFunction(inputX(), inputY()));
    }
}
