package geometri;

import java.awt.*;

public class Line extends GeometricShape {

    private int x2, y2;

    /**
     * Constructor that take coordinates for two points and makes a line inbetween. Sets the color to c.
     * @param x1 Distance right from origo for the first point.
     * @param y1 Distance down from origo for the first point.
     * @param x2 Distance right from origo for the second point
     * @param y2 Distance down from origo for the second point.
     * @param c Color of the object.
     * @throws <tt>IllegalPositionException</tt> if any coordinate is negative.
     */
    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {}

    /**
     * Constructor that takes position for two forms and makes a line inbetween. Sets the color to c.
     * @param f1 The first geometrical form for the line.
     * @param f2 The second geometrical form for the line.
     * @param c Color of the object.
     */
    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {}

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
    public int getPerimeter() {
        return 0;
    }
}