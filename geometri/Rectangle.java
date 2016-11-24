package geometri;

import java.awt.*;

public class Rectangle extends Square {

    private int height;

    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {}
    public Rectangle(GeometricalForm f, int width, int height, Color c) {}

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}