package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList= new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape){
        // do nothing
    }
    public void removeFigure(Shape shape){
        // do nothing
    }
    public Shape getFigure(int n){
        // returning null means that the operation was unsuccessful
        return null;
    }
    public void showFigures(){
        // do nothing
    }

}
