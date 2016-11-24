package geometri;

import java.awt.*;

public class Square extends GeometricShape {

    private int side;

    public Square(int x, int y, int side, Color c) throws IllegalPositionException {    }

    public Square(GeometricalForm f, int side, Color c) {    }

    public Square() {
    }

    @Override
    public int getArea() {
        return 0;
    }


    @Override
    public int getWidth() {
        return 0;
    }


    @Override
    public int getPerimeter() {
        return 0;
    }
}