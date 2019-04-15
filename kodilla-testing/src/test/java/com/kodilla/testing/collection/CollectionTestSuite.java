package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        List<Integer> expectedList = new ArrayList<Integer>();
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(expectedList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);

        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(expectedList, result);
    }
}
