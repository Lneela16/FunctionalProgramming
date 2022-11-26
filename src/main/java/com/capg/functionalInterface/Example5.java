package com.capg.functionalInterface;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        //System.out.println(IntStream.rangeClosed(1,3).sum());
        System.out.println(IntStream.iterate(1,e->e+2).limit(5).peek(System.out::println).sum());

    }
}
