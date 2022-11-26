package com.capg.streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        printALlNumbers(List.of(1,2,2,3,4));
    }

    private static boolean isEven(int number){
        return number%2==0;
    }

    private static void printALlNumbers(List<Integer> numbers) {
//        for(int number: numbers){
//            if(number%2==0){
//                System.out.println(number);
//            }
//        }

//        numbers.stream()
//                .filter(com.capg.streams.Example3::isEven)
//                .forEach(System.out::println);
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);

    }
}
