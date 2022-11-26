package com.capg.streams;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
       printAllNumber(List.of(1,2,23,2,1,1));

    }
private static void print(int number){
    System.out.println(number);
}
    private static void printAllNumber(List<Integer> numbers) {
        numbers.stream().forEach(Example2::print);

    }


}
