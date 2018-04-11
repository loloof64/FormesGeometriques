package com.wildcdlolo.shapes;

public class Square implements Shape {
    private int side;

    public Square(int side){
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }
}
