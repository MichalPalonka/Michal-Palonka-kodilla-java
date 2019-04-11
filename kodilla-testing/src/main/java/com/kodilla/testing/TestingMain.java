package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if(result.equals("theForumUser")) {
            System.out.println("simpleUser test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();
        int addAToB = calculator.add(10,4);
        if(addAToB == 14) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error");
        }
        int substract = calculator.substract(10,4);
        if(substract == 6) {
            System.out.println("substract test OK");
        } else {
            System.out.println("Error");
        }
    }
}