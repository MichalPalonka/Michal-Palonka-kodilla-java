package com.kodilla.testing.shape;

        import java.util.ArrayList;
        import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList= new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }
    public Shape getFigure(int n){
        return shapeList.get(n);
    }
    public List<Shape> showFigures(){
        return shapeList;
    }

}
