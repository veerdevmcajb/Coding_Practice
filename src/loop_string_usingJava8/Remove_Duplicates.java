package loop_string_usingJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicates {

    public static void main(String[] args) {

        String str = "shivanand";
        String result ="";

        for(char c :str.toCharArray()){  // converting str to charArray
            if(result.indexOf(c) ==-1){  // check id character is present in index or not  if not present return -1
                result+=c;              // add that char in result
            }
        }
        System.out.println("Removing duplicates using loop \n"+ result);

        // using java 8
        System.out.println();

        String res = str.chars().distinct().mapToObj(c-> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println("Removing duplicates using Stream \n "+ res);


        System.out.println("duplicates Elements ");
        String[]arr=str.split("");
        List<String> strList= Arrays.asList(arr);
        strList.stream().filter(e->Collections.frequency(strList,e)>1).distinct().forEach(System.out::println);

        strList.stream().distinct().forEach(System.out::print);


    }
}


//result.indexOf(c) checks if character c is already in result
//If it returns -1, it means: character in not present.