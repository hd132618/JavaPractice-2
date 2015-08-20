package org.dimigo.inheritance;

/**
 * Created by gandd on 2015-08-20.
 */
public class FigureTest {
    public static void main(String args[]) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 10, 5, 8);
        Rectangle rectangle = new Rectangle(20, 20, 5, 8);

        System.out.println("원 넓이 : " + circle.calcArea());
        System.out.println("삼각형 넓이 : " + triangle.calcArea());
        System.out.println("사각형 넓이 : " + rectangle.calcArea());

        circle.printCenter();
        triangle.printCenter();
        rectangle.printCenter();

        System.out.println("중심좌표 이동 (x, y축 5씩)");

        circle.moveFigure(5, 5);
        triangle.moveFigure(5, 5);
        rectangle.moveFigure(5, 5);

        circle.printCenter();
        triangle.printCenter();
        rectangle.printCenter();

    }
}
