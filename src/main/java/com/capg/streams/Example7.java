package com.capg.streams;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        int oddSum= addOddNumbers(List.of(1,2,3,4,2,1,3));
        System.out.println(oddSum);
    }

    private static int addOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number->number%2!=0).reduce(0,(x,y)->x+y);

    }
}
