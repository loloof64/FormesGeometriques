package com.wildcdlolo.shapes;

public class Circle implements Shape {
    private final int rayon;

    public Circle(int rayon){
        this.rayon = rayon;
    }

    public double perimeter() {
        return 2 * Math.PI * rayon;
    }

    public double area() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void draw() {
        // Not implemented
    }
}
