package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving", drive.getTaskName());
        Assert.assertEquals(false, drive.isTaskExecuted());
        drive.executeTask();
        Assert.assertEquals(true, drive.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
        painting.executeTask();
        Assert.assertEquals(true, painting.isTaskExecuted());
    }
}
