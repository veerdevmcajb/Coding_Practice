package loop_string_usingJava8;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Ex1 {
    public static void main(String[] args) {

      List<List<Integer>> res = List.of(
              List.of(1,2),
              List.of(3,4),
              List.of(5,6) );

      List<Integer> flatmap = res.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatmap);
    }


}
