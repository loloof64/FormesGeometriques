package com.wildcdlolo.shapes;

public class Square extends Rectangle {

    public Square(int side){
        super(side, side);
    }

    public double perimeter() {
        return 2* (width + height);
    }

    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        // Not implemented
    }
}
