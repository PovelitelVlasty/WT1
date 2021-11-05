package Laba1.classesAndObjects.Task9.utils;

/**
 * Ball class
 */
public class Ball {
    private double weight;
    private Color color;

    /**
     * Create a new instance of Ball
     * @param weight - weight of the ball
     * @param color - color of the ball
     */
    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    /**
     * Get ball's weight
     * @return double
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Get ball's color
     * @return Color
     */
    public Color getColor() {
        return this.color;
    }
}
