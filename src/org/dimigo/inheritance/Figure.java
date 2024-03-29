package org.dimigo.inheritance;

/**
 * Created by gandd on 2015-08-20.
 */
public class Figure {
    private int centerX;
    private int centerY;

    public Figure() {

    }

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    protected double calcArea() {
        return 0.0;
    }
    protected void printCenter() {
        System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
    }
    protected void moveFigure(int x, int y) {
        centerX += x;
        centerY += y;
    }
}
