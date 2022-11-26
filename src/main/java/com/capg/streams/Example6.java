package com.capg.streams;

import java.util.List;

public class Example6 {
    private static int sum;

    public static void main(String[] args) {

         sum= addListNUmbers(List.of(1,2,3,1,12,32,21,22,0));
        System.out.println(sum);

    }

    private  static  int add(int a , int b){
        System.out.println(a+" "+b);
        return a+b;
    }

    private static int addListNUmbers(List<Integer> numbers) {

       // return numbers.stream().reduce(0, com.capg.streams.Example6::add);
//        for(int number: numbers){
//            sum= sum+number;
//        }
        return numbers.stream().reduce(0,(x,y)->x>y?x:y);



      //return   numbers.stream().reduce(0, com.capg.streams.Example6::add);
     //   return numbers.stream().reduce(0,(x,y)->x+y);
      //  return  numbers.stream().reduce(0, Integer::sum);
      //  return numbers.stream().reduce(0, Integer::max);




    }
}
