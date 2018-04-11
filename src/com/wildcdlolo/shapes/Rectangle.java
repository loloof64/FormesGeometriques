package com.wildcdlolo.shapes;

public class Rectangle implements Shape {
    private final int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double area() {
        return width * height;
    }
}
