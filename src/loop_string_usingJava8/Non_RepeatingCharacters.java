package loop_string_usingJava8;

import java.util.stream.Stream;

public class Non_RepeatingCharacters {

    public static void main(String[] args) {

        //String str="aabbcde";
        String str="shivanand";
        for(char c:str.toCharArray()){
           if(str.indexOf(c)== str.lastIndexOf(c)){
               System.out.println(c);
           }
        }

//        Character ch = str.chars().mapToObj(c->(char)c)
//                .filter(c->str.indexOf(c) == str.lastIndexOf(c))
//                .findFirst().orElse(null);
//
//        System.out.println(ch);


        System.out.println("Non-Repeating characters using stream ");
       str.chars() // convert ti IntStream
                .mapToObj(c->(char)c) // converting Int to char
                .filter(c->str.indexOf(c) == str.lastIndexOf(c)).forEach(System.out::println);
      //  System.out.println(chr);


        System.out.println("Find First non repeating character");
        Character ch = str.chars().mapToObj(c->(char)c)
                .filter(c->str.indexOf(c) == str.lastIndexOf(c))
                .findFirst().orElse(null);

        System.out.println(ch);
    }
}
