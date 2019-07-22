package com.kodilla;

public class Calculator {
    public int addAToB(int a, int b){
        return a + b;
    }
    public int substractBFromA(int a, int b){
        return a-b;
    }

    public static void main (String[] args){
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(3,4);
        System.out.println(result);
        result = calculator.substractBFromA(9,4);
        System.out.println(result);
    }
}