package geometri;

import java.awt.*;

public class Oval extends Circle {

    private int height;

    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {    }
    public Oval(GeometricalForm f, int width, int height, Color c) {}

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }


}