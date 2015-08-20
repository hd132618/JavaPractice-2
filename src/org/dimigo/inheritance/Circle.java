package org.dimigo.inheritance;

/**
 * Created by gandd on 2015-08-20.
 */
public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius) {
        super(centerX, centerY);
        this.radius = radius;
    }

    protected double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    protected void printCenter() {
        System.out.print("원 ");
        super.printCenter();
    }
}
