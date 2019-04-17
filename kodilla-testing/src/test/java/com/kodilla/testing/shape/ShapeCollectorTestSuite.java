package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeList());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapeCollector.getShapeList());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);
        //When
        Shape tempShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, tempShape);

    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        shapeCollector.addFigure(shape);
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> tempShapeList = shapeCollector.getShapeList();
        //Then
        Assert.assertEquals(shapeList.toString(),tempShapeList.toString());
    }
}