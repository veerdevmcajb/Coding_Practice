package loop_string_usingJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringEx {

    public static void main(String[] args) {

        String str="Shivanand";
        String res="";

        // uppercase using stream
        System.out.println(str.toUpperCase());


        for(char c :str.toCharArray()){
            res= res + Character.toUpperCase(c);
        }
        System.out.println(res);


        // Count Words in Sentence

        String sentence = "java is awesome";
     String[]string = sentence.split(" ");
        System.out.println(string.length);

        // using stream
        long count= Arrays.stream(sentence.split(" ")).count();
        System.out.println(count);

        // sort characters in String

        String str1 = "Veer";
        char [] arr = str1.toLowerCase().toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));

        // using stream
        str1.toLowerCase().chars().sorted().mapToObj(c->String.valueOf((char) c)).forEach(System.out::println);


        // remove space from string

        String str2 = "shiv anand";
        String res2="";

        for(char c :str2.toCharArray()){
            if(c!=' '){
                res2 = res2 + c;
            }
        }
        System.out.println(res2);

        // using stream
        str2.chars().filter(c->c!=' ')
                .mapToObj(c->String.valueOf((char) c)).forEach(System.out::print);


        System.out.println();
        //🔹 12. Replace Spaces with Dash
        String result12 = str2.toLowerCase().chars()
                .mapToObj(c->(c==' ')?"-" : String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result12);

        // sum of degits in String

        String str3="1234";
        int sum = str3.chars()
                .map(c-> c - '0')
                .sum();
        System.out.println(sum);

        String s1 = "listen";
        String s2 = "silent";

        boolean res13= s1.chars()   // convert string to IntStream and ASCII value
                .sorted()   // sorted ASCII value
                .boxed()    // Converts IntStream → Stream<Integer>
                .collect(Collectors.toList())   //Converts stream → List<Integer>
                .equals(
                        s2.chars()
                                .sorted()
                                .boxed()
                                .collect(Collectors.toList())
                );

        System.out.println("Anagram is : "+ res13);

    }
}
