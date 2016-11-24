package geometri;

import java.awt.*;
import java.awt.Color;

public abstract class GeometricShape implements GeometricalForm {

    /**
     * Color for the geometrical shape.
     */
    protected Color c;

    /**
     * Position for the shapes top left corner.
     */
    protected int x, y;

    /**
     * @inheritDoc
     */
    @Override
    public int getX() {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int getY() {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Color getColor() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void move(int dx, int dy) throws IllegalPositionException {    }

    /**
     * @inheritDoc
     */
    @Override
    public void place(int x, int y) throws IllegalPositionException {    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }

    /**
     * Checks if the area and the perimeter are equal.
     * @param o To object to compare with.
     * @return Returns true if the objects are equal.
     */
    @Override
    public abstract boolean equals(Object o) {
        return false;
    }

    /**
     * Generates a hashcode for the object.
     * @return Returns an unique integer number.
     */
    @Override
    public abstract int hashCode() {
        return 0;
    }

    /**
     * Gives the height of the object.
     * @return the height as integer.
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * Gives the width of the object.
     * @return the width as integer.
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * Fills the object with a specifiv color.
     * @param g A graphic pen to draw with.
     */
    @Override
    public void fill( Graphics g ){}

}
