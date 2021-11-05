package Laba1.javaFundamentals;

import java.util.Scanner;


public class Task2 {
   
    public static int inputX() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        return scan.nextInt();
    }

    
    public static int inputY() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input y: ");
        return scan.nextInt();
    }

    
    public static boolean checkPoint(int x, int y) {
        boolean isBelongsTopArea = ((x >= -4) && (x <= 4)) && ((y >= 0) && (y <= 5));
        boolean isBelongsBottomArea = ((x >= -6) && (x <= 6)) && ((y >= -3) && (y <=0));

        return isBelongsTopArea || isBelongsBottomArea;
    }

    
    public static void printResult() {
        if (checkPoint(inputX(), inputY())) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    
    public static void main(String[] args) {
        System.out.println("-----Task 2-----");
        printResult();
    }
}
