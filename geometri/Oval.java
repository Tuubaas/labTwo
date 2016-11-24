package geometri;

import java.awt.*;

public class Oval extends Circle {

    private int height;

    /**
     * Constructs an oval with width and height with start position x,y in the top left corner.
     * Sets the color to c.
     * @param x Distance right from origo.
     * @param y Distance right from origo.
     * @param width The width of the oval.
     * @param height The height of the oval.
     * @param c Color of the object.
     * @throws <tt>IllegalPositionException</tt> if any coordinate is negative.
     */
    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {    }

    /**
     * Constructs an oval with width and height with start position from the geometrical form f in the top left corner.
     * Sets the color to c.
     * @param f The geometrical form f with coordinates for the oval.
     * @param width The width of the oval.
     * @param height The height of the oval.
     * @param c Color of the object.
     */
    public Oval(GeometricalForm f, int width, int height, Color c) {}

    /**
     * @inheritDoc
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int getArea() {
        return 0;
    }

    /**
     * @inhertDoc
     */
    @Override
    public int getPerimeter() {
        return 0;
    }

}
