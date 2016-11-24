package geometri;

import java.awt.*;

public class Circle extends GeometricShape {

    private int diameter;

    /**
     * Constructor that takes variables x and y that decides the starting point.
     * And takes the diameter to create a circle. Sets the color to c.
     * @param x Distance right from origo.
     * @param y Distance down from origo.
     * @param diameter Diameter size for the circle.
     * @param c Color of the object.
     * @throws <tt>IllegalPositionException</tt> if any coordinate is negative.
     */
    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {}

    /**
     * Constructor that takes f to decide the starting point for the circle.
     * And takes the diameter to create a circle. Sets the color to c.
     * @param f The geometrical form f with coordinates.
     * @param diameter Diameter size for the circle.
     * @param c Color of the object.
     */
    public Circle(GeometricalForm f, int diameter, Color c) {}

    /**
     * An empty constructor for subclass Oval.
     */
    public Circle() {
    }

    /**
     * @inheritDoc
     */
    @Override
    public int getArea() {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int getPerimeter() {
        return 0;
    }
}