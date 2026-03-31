package loop_string_usingJava8;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Count_Characters {

    public static void main(String[] args) {

        String str = "Shiv";
        int count =0;

        for(int i=0; i<=str.length()-1;i++){
            char ch = str.charAt(i);
            count++;
        }
        System.out.println(count);


        // using java 8

        System.out.println("count is "+ str.chars().count());

//  =============================================================================================

        System.out.println("Sorting ");
        List<String> ll =new ArrayList<>(Arrays.asList("apple","dog","banana","cat"));
        ll.sort(String::compareTo);
        System.out.println(ll);

        ll.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("Descending Order "+ ll);




        System.out.println("=============");
        List<Integer> list = List.of(1,2,3,4,5);
       List<Integer> res = list.stream().takeWhile((e)->e<2).collect(Collectors.toList());
        System.out.println(res);

        System.out.println("Sum of numbers "+ list.stream().reduce(0,(a,b)->a+b));
        System.out.println(list.stream().reduce((a,b)->a+b));

        Optional<Integer> mult = list.stream().reduce((a, b)->a+b);
        mult.ifPresent(System.out::println);
        if(mult.isPresent()) System.out.println(mult.get());
        //System.out.println(mult);

        mult.ifPresentOrElse(System.out::println,() -> System.out.println("nothing"));




    }
}
