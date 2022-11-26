package com.capg.functionalInterface;

import java.util.List;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {
        List<String>  courses= List.of("spring","springBoot","aws","pcf");
       courses.stream().map(course->course.charAt(0)).map(x->String.valueOf(x).toUpperCase());

    }
}
