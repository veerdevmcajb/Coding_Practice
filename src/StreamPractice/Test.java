package StreamPractice;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        // frequency of characters
        String str = "abcangbcliipooo";
        Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);
//
//        Array res=List.of(1,2,3,4,8,5,1,5,4,5,9);
//        res.stream().
//                strList.stream().filter(e-> Collections.frequency(strList,e)>1).forEach(System.out::println);

        List<Integer> ll=List.of(1,2,3,4,5,6,7,8,9,10);
       int res = ll.stream().filter(e->e%2==0).reduce(1,(a,b)->a*b);
        System.out.println(res);

//        ll.stream().filter(e->e%2==0).map(e->e*e).forEach(System.out::println);
//
      //  IntStream.range(1,10).filter(e->e%2==0).reduce(1,(a,b)->a*b);

        System.out.println("===============================================");

        IntStream.rangeClosed(1,100)
                .filter(n->IntStream.rangeClosed(1,n)
                .filter(i->n%i==0)
                .count()==2).forEach(System.out::println);

//        IntStream.rangeClosed(2, 100)
//                .filter(e -> IntStream.rangeClosed(2, (e/2)+1).
//                        allMatch(x -> e % x != 0)).forEach(System.out::println);

        //===========================
            //startTime
        System.out.println("============================================");
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(System.out::println);
        System.out.println(intStream);
            // endTime
    }
}
