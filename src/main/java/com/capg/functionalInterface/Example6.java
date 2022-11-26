package com.capg.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<String > names= List.of("spring","hello","pool","old");
        List<String > names1= List.of("spring","helio","pool","old");
       // System.out.println(names.stream().map(name->name.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));

        List<String> modifynames= new ArrayList<>(names1);
        modifynames.replaceAll(e->e.toUpperCase());
        System.out.println(modifynames);
        modifynames.removeIf(e->e.length()<5);
        System.out.println(modifynames);
    }
}
