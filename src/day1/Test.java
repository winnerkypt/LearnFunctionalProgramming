/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Test {
    public static List<Course> courses = new LinkedList<>();
    
    private static void courseListInitializatiob(){
        courses.add(new Course("int101",3.0,"compro"));
        courses.add(new Course("int201",3.0,"frontend"));
        courses.add(new Course("int102",2.5,"winner"));
        courses.add(new Course("int102",2.5,"backend"));
        // courses.add(null);        
    }
    public static void simpleSort(){
        for(Course course : courses){
            System.out.println(course);
        }
        courses.sort(Comparator.naturalOrder()); //compare all List
        System.out.println("-----Simple Sort----------");
        // courses.forEach(course -> System.out.println(course));
        //courses.forEach(System.out::println);

         courses.parallelStream() //each core of cpu but sequential will do in 1 core
//                 .filter(c->c.getCredit()<3) //check credit < 3
                 .sorted(Comparator.nullsLast(
                    // Comparator.comparing(Course::getDescription).reversed()))  [sort by description]
                    Comparator.comparingDouble(Course::getCredit).reversed()
                    .thenComparing(Comparator.comparing(Course::getDescription))
                    ))
                 .forEachOrdered(System.out::println);
    }

    

    private static void similarityMatching(){
        courses.stream()
            .map(Course::getDescription)
            .map(Text::showFeature)
            .forEach(System.out::println);
        System.out.println("--------------------");
        courses.stream()
        .filter(c->c.getDescription().computeSimilarity("programming")>0.0)
        .forEach(System.out::println);
        
    }
    // public static void creditSort(){
    //     System.out.println("-----Credit Sort----------");
    //     CreditCompare creditCom = new CreditCompare();
    //     courses.sort(creditCom);
    //     for(Course course : courses){
    //         System.out.println(course);
    //     }
    // }
    // public static void descriptionSort(){
    //     System.out.println("-----Description Sort----------");
    //     DescriptionCompare descripCom = new DescriptionCompare();
    //    courses.sort(descripCom);
    //     for(Course course : courses){
    //         System.out.println(course);
    //     }
    // }
    
    public static void main(String[] args) {
              courseListInitializatiob();
              simpleSort();
            //   creditSort();
            //  descriptionSort();

            similarityMatching();
    }
}
