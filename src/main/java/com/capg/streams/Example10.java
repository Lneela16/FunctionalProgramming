package com.capg.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
   static List<Integer> result;
    public static void main(String[] args) {
       // List<Integer>  result= sample1(List.of(1,1,1,1,12,3,4,1));
       // System.out.println(result);

        sample2(List.of("HI","laharika","hello"));

    }

    private static void sample2(List<String> names) {

     result=   names.stream().map(name->name.length()).collect(Collectors.toList());
        System.out.println(result);
    }

    private static List<Integer> sample1(List<Integer> numbers) {

        return numbers.stream().distinct().collect(Collectors.toList());
    }
}
