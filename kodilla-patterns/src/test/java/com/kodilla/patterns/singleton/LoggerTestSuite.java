package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void openSettingsFile() {
        logger.getInstance().open("logs.txt");
    }

    @AfterClass
    public static void closeSettingsFile() {
        logger.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        logger.getInstance().log("New log in log file for logger class.");
        //When
        String lastLog = logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("New log in log file for logger class.", lastLog);
    }
}
