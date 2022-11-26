package com.capg.functionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,2,3,3,2,4,5);
     //   numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
        Function<Integer, Integer> function = x -> x * x;
       List<Integer> squareOutput= getOutput(numbers, function);
    }

    private static List<Integer> getOutput(List<Integer> numbers, Function<Integer, Integer> function) {
        return numbers.stream().map(function).collect(Collectors.toList());
    }

}
