package com.capg.functionalInterface;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course{

    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}
public class CustomClassExample {
    public static void main(String[] args) {

     List<Course> courses=   List.of(new Course("Spring","Framework",85,12),
                new Course("SpringBoot","Framework",72,15),
                new Course("Pcf","cloudtech",70,20),
             new Course("Aws","cloudtech",68,20)
        );

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList()))));

        //System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.groupingBy(Course::getName,Collectors.toList()))));
//        System.out.println(courses.stream().collect(Collectors
//                .groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));


      //  System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
      //  System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));


     Comparator<Course> comparingReviewScore= Comparator.comparing(Course::getReviewScore).reversed();



       // System.out.println(courses.stream().filter(course -> course.getReviewScore()>68).map(course -> course.getName()).collect(Collectors.toList()));
//        System.out.println(courses.stream().filter(course -> course.getReviewScore()>70)
//                .mapToInt(course -> course.getNoOfStudents()).count()
//        );
     //System.out.println(courses.stream().allMatch(course->course.getReviewScore() > 50));
       // System.out.println( courses.stream().noneMatch(course -> course.getReviewScore() > 68));
        Comparator<Course> camparingNoOfStudents= Comparator.comparing(Course::getNoOfStudents);
       // System.out.println(
        //courses.stream().sorted(camparingNoOfStudents).collect(Collectors.toList()));

        Comparator<Course> camparingDecreaseStudents= Comparator.comparing(Course::getNoOfStudents).reversed();
        //System.out.println(courses.stream().sorted(camparingDecreaseStudents).collect(Collectors.toList()));

        Comparator<Course> comparingByNoStudentsAndReviewScore=
                Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore)
                        .reversed();

      //  System.out.println(courses.stream().sorted(comparingByNoStudentsAndReviewScore).collect(Collectors.toList()));
//        System.out.println(courses.stream().sorted(comparingByNoStudentsAndReviewScore).limit(1)
//                .collect(Collectors.toList()));
        //
         //System.out.println(courses.stream().sorted(comparingByNoStudentsAndReviewScore).skip(2).collect(Collectors.toList()));

        //System.out.println(courses.stream().takeWhile(course -> course.getReviewScore()<=72).collect(Collectors.toList()));

        //System.out.println(courses.stream().max(comparingByNoStudentsAndReviewScore).stream().collect(Collectors.toList()));

//        System.out.println(courses.stream()
//                .filter(course -> course.getReviewScore()<=50)
//                .min(comparingByNoStudentsAndReviewScore)
//                .orElse(new Course("Aws","cloudtech",68,20)));
//stream, sorted,filter,lambda,map,reduce,methodreference,max,min,takewhile,dropwhile,skip,limit,findfirst,orelse
        //allmatch,nonematch.anymatch,findany











    }
}
