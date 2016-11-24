package geometri;

import java.awt.*;

public class Point extends GeometricShape {

    /**
     * A constructor with three parameters.
     * x, y for position and c for color.
     * @param x Distance right from origo.
     * @param y Distance down from origo.
     * @param c Color of the point.
     * @throws <tt>IllegalPositionException</tt> if any coordinate is negative.
     */
    public Point(int x, int y, Color c) throws IllegalPositionException {    }

    /**
     * A constructor with two parameters.
     * f for the geometrical form and c for color.
     * @param f The geometrical form for the point.
     * @param c Color of the point.
     */
    public Point(GeometricalForm f, Color c) {}

    /**
     * The Area for the point is always zero.
     */
    @Override
    public int getArea() {
        return 0;
    }

    /**
     * The perimeter for the point is always zero.
     */
    @Override
    public int getPerimeter() {
        return 0;
    }
}
