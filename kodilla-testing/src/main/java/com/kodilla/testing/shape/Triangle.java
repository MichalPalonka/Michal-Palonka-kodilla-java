package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double a;
    private double h;
    private double field = (a*h)/2;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }
}
