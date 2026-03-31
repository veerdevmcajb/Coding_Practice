package loop_string_usingJava8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str ="shivanand";

        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if("aeiou".indexOf(c)!=-1)
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
        System.out.println("=================");

        countVowels();
    }

    public static void countVowels(){

        String str1="ShivanandChandankar";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : str1.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                map.put(c,map.getOrDefault(c,0)+1);
            }

        }
            System.out.println(map);

        System.out.println("====using Stream() =======");
        Map <Character ,Long> res= str1.toLowerCase().chars()
                        .mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)!=-1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(res);
    }
}
