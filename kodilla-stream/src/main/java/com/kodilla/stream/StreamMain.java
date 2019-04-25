package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

         */
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String testString1 = poemBeautifier.beautify("Test text to test task.", (text -> "ABC " + text + " ABC "));
        System.out.println(testString1);
        String testString2 = poemBeautifier.beautify("Test text to test task.", text -> text.toUpperCase());
        System.out.println(testString2);
        String testString3 = poemBeautifier.beautify("Test text to test task.", (text -> "*******************\n" + text + "\n*******************"));
        System.out.println(testString3);
        String testString4 = poemBeautifier.beautify("Test text to test task.", text -> text.toLowerCase());
        System.out.println(testString4);
    }
}