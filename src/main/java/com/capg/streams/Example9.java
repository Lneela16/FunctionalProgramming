package com.capg.streams;

import javax.crypto.spec.PSource;
import java.util.Comparator;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
         //distinctNumbers(List.of(1,2,2,3,1,4,5,6,3,8,6));
        distinctString(List.of("Spring","hello","AWSiiiu","k","ok"));

    }

    private static void distinctString(List<String> courses) {
        courses.stream().sorted(Comparator.comparing(course->course.length())).forEach(System.out::println);

    }

    private static void distinctNumbers(List<Integer> numbers) {
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        numbers.stream().distinct().forEach(System.out::println);
//        numbers.stream().sorted().forEach(System.out::println);
    }

}
