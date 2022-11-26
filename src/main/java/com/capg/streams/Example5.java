package com.capg.streams;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        //print the number of characters in each course name

        printNoOFCharacters(Arrays.asList("Spring","SpringBoot","MicroServices","API","PCF"));
    }

    private static void lengthOFCharacter(String str){
         System.out.println(str.length());
    }
    private static void printNoOFCharacters(List<String> courses) {
        //courses.stream().forEach(com.capg.streams.Example5::lengthOFCharacter);
       // courses.stream().forEach(course->System.out.println(course.length()));
        courses.stream().map(course->course + " "+course.length()).forEach(System.out::println);
    }
}
