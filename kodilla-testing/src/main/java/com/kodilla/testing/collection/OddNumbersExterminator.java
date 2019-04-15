package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> numbers){
        List<Integer> oddNumbersList  = new ArrayList<Integer>();

        for(int tempNumber : numbers){
            if(tempNumber % 2==0){
                oddNumbersList.add(tempNumber);
            }
        }
        return oddNumbersList;
    }

}
