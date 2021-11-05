package Laba1.classesAndObjects.Task9.main;

import Laba1.classesAndObjects.Task9.utils.Ball;
import Laba1.classesAndObjects.Task9.utils.Busket;
import Laba1.classesAndObjects.Task9.utils.Color;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Task9 class
 */
public class Task9 {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<Ball>(Arrays.asList(
                new Ball(0.50, Color.GREEN),
                new Ball(0.75, Color.BLUE),
                new Ball(0.31, Color.RED),
                new Ball(1.15, Color.BLUE),
                new Ball(0.80, Color.BLUE)
        ));

        Busket busket = new Busket(balls);

        System.out.println("-----Task 9-----");
        System.out.println("Balls weight in busket: " + busket.getWeight());
        System.out.println("Count of blue balls : " + busket.getCountBalls(Color.BLUE));
    }
}
