package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String task1 = "task1";
        String task2 = "task2";
        String task3 = "task3";
        board.getToDoList().addTask(task1);
        board.getInProgressList().addTask(task2);
        board.getDoneList().addTask(task3);
        //Then
        Assert.assertEquals("task1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("task2", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("task3", board.getDoneList().getTasks().get(0));
    }
}
