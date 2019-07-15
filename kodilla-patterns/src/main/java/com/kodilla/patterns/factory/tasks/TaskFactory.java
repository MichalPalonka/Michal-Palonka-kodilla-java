package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Shop", "Car");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Paint", 1);
            case PAINTING:
                return new PaintingTask("Painting", "Blue", "Room");
            default:
                throw new IllegalArgumentException();
        }
    }
}
