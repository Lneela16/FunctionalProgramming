package com.capg.streams;

import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        int result= addSquareOfList(List.of(1,2));
        System.out.println(result);
    }

    private static int addSquareOfList(List<Integer> numbers) {
     //  return numbers.stream().map(number->number*number).reduce(0,Integer::sum);
        return numbers.stream().map(number->number*number).reduce(0, (x,y)->x+y);


    }
}
