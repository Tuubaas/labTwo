package geometri;

import java.awt.*;

public class Square extends GeometricShape {

    private int side;

    /**
     * Constructor that takes two coordinates, x and y, to create a point
     * and the parameter side to create a square. Sets the color to c. 
     * @param x Distance right from origo. 
     * @param y Distance down from origo. 
     * @param side Length of the square's side. 
     * @param c Color of th object. 
     * @throws IllegalPositionException if any coordinate is negative. 
     */
    public Square(int x, int y, int side, Color c) throws IllegalPositionException {    }

    /**
     * Constructor that takes the geometrical form f and the square's side
     * to create a square. sets the color to c. 
     * @param f Geometrical for f with the coordinates for the square. 
     * @param side Length of the square's side. 
     * @param c Color of the object. 
     */
    public Square(GeometricalForm f, int side, Color c) {    }

    /**
     * Empty constructor to use by subclasses. 
     */
    public Square() {
    }

    /**
     * 
     * @inheritDoc
     */
    @Override
    public int getArea() {
        return 0;
    }

    /**
     * 
     * @inheritDoc
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * 
     * @inheritDoc
     */
    @Override
    public int getPerimeter() {
        return 0;
    }
}
