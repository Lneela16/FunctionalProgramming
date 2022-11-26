package com.capg.streams;

import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
       printOddNumbers(List.of(1,2,3,4,3,5,6));
      //  printCourses(Arrays.asList("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure"));

    }

    private static void printCourses(List<String> courses) {
       // courses.stream().forEach(System.out::println);
       // courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
    }


    private static void printOddNumbers(List<Integer> numbers) {
        //numbers.stream().filter(number->!(number%2==0)).forEach(System.out::println);
        numbers.stream().map(number->number*2).forEach(System.out::println);
    }
}
