package geometri;

import java.awt.*;

public class Rectangle extends Square {

    private int height;

    /**
     * Constructor that takes the x and the y-coordinates and draws a rectangle with the specified height and width. Sets the color to c.
     * @param x Distance right from origo.
     * @param y Distance down from origo.
     * @param width Width of the rectangle.
     * @param height Height of the rectangle.
     * @param c Color of the rectangle.
     * @throws <tt>IllegalPositionException</tt> if any coordinate is negative.
     */
    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {}
    
    /**
     * A constructor with four parameters.
     * @param f The geometrical form for the rectangle.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @param c Color of the rectangle.
     */
    public Rectangle(GeometricalForm f, int width, int height, Color c) {}

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
    
    /**
     * @inheritDoc
     */
    @Override
    public int getHeight() {
        return 0;
    }

}
