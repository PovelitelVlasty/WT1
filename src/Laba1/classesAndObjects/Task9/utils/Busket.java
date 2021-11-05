package Laba1.classesAndObjects.Task9.utils;

import java.util.ArrayList;


public class Busket {
    private ArrayList<Ball> balls;
    private double weight;

    
    public Busket() {
        this.balls = new ArrayList<>();
    }

    
    public Busket(ArrayList<Ball> balls) {
        this.balls = new ArrayList<>(balls);

        for (Ball ball : balls) {
            this.weight += ball.getWeight();
        }
    }

    
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

    
    public int getCountBalls(Color color) {
        int counter = 0;

        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                counter++;
            }
        }

        return counter;
    }

    
    public double getWeight() {
        return this.weight;
    }
}
