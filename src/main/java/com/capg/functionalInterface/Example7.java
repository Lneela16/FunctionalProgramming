package com.capg.functionalInterface;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {

    List<Character> chars= convertToString("Hello");
        System.out.println(chars);
        Map<Character,Long> output=chars.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(output);
    }

    private static List<Character> convertToString(String str) {

        return str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    }
}
