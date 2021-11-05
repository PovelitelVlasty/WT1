package Laba1.classesAndObjects.Task9.utils;

import java.util.ArrayList;

/**
 * Busket class
 */
public class Busket {
    private ArrayList<Ball> balls;
    private double weight;

    /**
     * Create a new instance of Busket
     */
    public Busket() {
        this.balls = new ArrayList<>();
    }

    /**
     * Create a new instance of Busket
     * @param balls - ArrayList<Ball></>
     */
    public Busket(ArrayList<Ball> balls) {
        this.balls = new ArrayList<>(balls);

        for (Ball ball : balls) {
            this.weight += ball.getWeight();
        }
    }

    /**
     * Add a ball to busket
     * @param ball - a ball
     * @return boolean
     */
    public boolean addBall(Ball ball) {
        if (ball != null) {
            this.balls.add(ball);
            this.weight += ball.getWeight();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Get count of balls of this color
     * @param color
     * @return int
     */
    public int getCountBalls(Color color) {
        int counter = 0;

        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Get general weight of busket
     * @return
     */
    public double getWeight() {
        return this.weight;
    }
}
