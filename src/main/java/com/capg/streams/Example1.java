package com.capg.streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        //System.out.println("hello");
        // print each element from list on its own line
        printAllNumbers(List.of(1,2,2,3,4,5,3,12));
    }

    private static void printAllNumbers(List<Integer> numbers) {
        for (int number: numbers){
            System.out.print( " "+number);
        }
    }

}
