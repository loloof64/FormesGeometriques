package com.wildcdlolo.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesApp {

    public static void main(String[] args) {
        List<Shape> shapesToDraw = getMyShapes();
        drawShapes(shapesToDraw);
    }

    private static List<Shape> getMyShapes(){
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(2, 3));
        myShapes.add(new Circle(10));
        myShapes.add(new Square(8));
        return myShapes;
    }

    private static void drawShapes(List<Shape> shapesToDraw){
        for (Shape currentShape : shapesToDraw){
            System.out.println("Current shape permimeter : "+currentShape.perimeter());
            System.out.println("Current shape area : "+currentShape.area());
            System.out.println("------------------------------------------------------");
        }
    }

}
