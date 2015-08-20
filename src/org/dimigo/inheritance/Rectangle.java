package org.dimigo.inheritance;

/**
 * Created by gandd on 2015-08-20.
 */
public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {

    }

    public Rectangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    protected double calcArea() {
        return width * height;
    }
    protected void printCenter() {
        System.out.print("사각형 ");
        super.printCenter();
    }

}
