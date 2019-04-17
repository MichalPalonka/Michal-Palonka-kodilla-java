package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "Square";
    private double a;
    private double field = a*a;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }
}
