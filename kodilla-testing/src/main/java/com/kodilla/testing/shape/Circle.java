package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name = "Circle";
    private double a;
    private double field = a*a*3.14;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }
}
