package StreamPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream65 {
    public static void main(String[] args) {

        //1. Given a list of integers, filter the even numbers.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        numbers.stream().filter(e->e%2==0).forEach(System.out::println);

        //2 Find the maximum number from a list of integers.
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//        Optional<Integer> res = numbers.stream().max(Comparator.comparing( integer -> integer));
//        System.out.println(res);

        // 3 Sort a list of integers in descending order.
//        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
//        List<Integer> collect = numbers.stream().sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(collect);

        // Count strings starting with a specific prefix, e.g., “A”.
//        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
//        long count = names.stream()
//                .filter(e->e.startsWith("A")).count();
//        System.out.println(count);

        // Find the first non-repeated character in a string.
//        String str = "Shivanand";
//        str.chars().mapToObj(c-> (char) c)
//                .filter(c->str.indexOf(c)== str.lastIndexOf(c)).findFirst();
//        Optional<Object> firstNonOcarrence = Optional.empty();
//        System.out.println(firstNonOcarrence.orElse(null));

        // 6 Convert all strings in a list to uppercase.
//        List<String> names = Arrays.asList("java", "stream", "api");
//        List<String> res= names.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(res);

        // 7 Calculate the sum of all numbers in a list.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//       java.lang.Integer res = numbers.stream().reduce(0,(a, b)->a+b);
//        System.out.println(res);
//
//       java.lang.Integer res2 = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(res2);

        // 8  Check if any string in a list contains “API”.
//        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
//        Boolean res = strings.stream().anyMatch(s->s.contains("API"));
//        System.out.println(res);

        //9 Identify duplicate elements in a list.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
//        Set<Integer> unique = new HashSet<>();
//       Set<Integer> duplicates = numbers.stream()
//                .filter(n->!unique.add(n))
//                .collect(Collectors.toSet());
//        System.out.println(duplicates);
//        System.out.println(unique);

        // 10. Group a list of strings based on their length.
//        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
//       Map<Integer , List<String>> length = words.stream().collect(Collectors.groupingBy(String::length));
//        System.out.println(length);

        // 11. : Given a list of lists, flatten it into a single list.
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8, 9)
//        );
//
//        List<Integer> collect = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(collect);

        //12.  Concatenate all strings in a list into a single string.
//        List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
//        String concat = words.stream().reduce("",(a,b)->a+" "+b).trim();
//        System.out.println(concat);

        // 13. Find the longest string in a list.
//        List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
//        String s = words.stream().reduce((a,b)->a.length() > b.length() ? a : b).orElse(null);
//        System.out.println(s);

        //14.Count the frequency of each character in a string.
//        String input = "success";
//        Map<Character, Long> frequency = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        System.out.println(frequency);

        // 16. Create a custom collector to join strings with a delimiter.
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//        String joinStr = words.stream().collect(Collectors.joining(" "));
//        System.out.println(joinStr);

        //17 : Remove null values from a list using filter.
//        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
//        List<String> res = words.stream().filter(Objects::nonNull).collect(Collectors.toList());
//        System.out.println(res);
//
//        words.stream().filter(Objects::isNull).forEach(System.out::println);

        // 18. Calculate the average of a list of integers.
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//        double a = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
//        System.out.println(a);

        // 19. Convert a list of strings into a map with the string as the key and its length as the value.
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//       Map<String , Integer > res  = words.stream().collect(Collectors.toMap(word->word , String::length));
//        System.out.println(res);
//
//        Map <String , Integer> res2= words.stream().collect(Collectors.toMap(m->m , String::length));
//        System.out.println(res);
//
//       List<String> names = Arrays.asList("Shiv","veer","Akash","manish","raj");
//        Map<String , Integer> length = names.stream().collect(Collectors.toMap(s->s , String::length));
//        System.out.println(length);

//        //Partition a list of numbers into even and odd.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        System.out.println(collect);

        // 21. Find the 3rd largest element in a list.
//        List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 30);
//        numbers.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);

        // 22.  Find all strings that are palindromes in a list.
//        List<String> words = Arrays.asList("radar", "level", "world", "java");
//        words.stream().filter(e-> e.equals(new StringBuilder(e).reverse().toString())).forEach(System.out::println);

        // 23. Reverse each string in a list.
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//            List<StringBuilder> rev = words.stream().map(e-> new StringBuilder(e).reverse()).collect(Collectors.toList());
//        System.out.println(rev);

        //24. Given a map, filter entries with values greater than 10 and collect keys into a list.
//        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
//        List<String> collect = map.entrySet().stream()
//                .filter(e -> e.getValue() > 10)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println(collect);

        // 25. Remove duplicates from a list using distinct().
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
//        numbers.stream().distinct().forEach(System.out::println);

        // 26 Find the most frequent character in a string.
//        String input = "success";
//        Character c1 = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey).orElseThrow();

     //   System.out.println(c1);

        // 27. Find common elements between two lists.
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
//        list1.stream().filter(list2::contains).forEach(System.out::println);

        // 28.  Calculate the sum of squares of all even numbers in a list.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        numbers.stream().filter(n->n%2==0)
//                .map(n-> n * n).forEach(System.out::println);

        // 29 .  Partition strings into palindromes and non-palindromes.
//        List<String> words = Arrays.asList("radar", "level", "java", "stream");
//        Map<Boolean, List<String>> collect = words.stream()
//                .collect(Collectors.partitioningBy(word -> word.equals(new StringBuilder(word).reverse().toString())));
//        System.out.println(collect);

        // 30 Skip the first 3 elements and limit the result to the next 2.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        numbers.stream().skip(3).limit(2).forEach(System.out::println);

        // 31. Find the longest word in a sentence using Streams.
//        String sentence = "Java Stream API is very powerful";
//       String longWord = Arrays.stream(sentence.split(" "))
//                .max(Comparator.comparing(String::length))
//                .orElse(null);
//
//        System.out.println(longWord);

       // 32. Compute the Cartesian product of two lists of integers.
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = Arrays.asList(4, 5);
//        List<String> res2= list1.stream().flatMap(i-> list2.stream().map(j->"(" + i +" "+ j + ")" ))
//                .collect(Collectors.toList());
//        System.out.println(res2);

        // 34. Group a list of strings by their first character.
//        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
//        Map<Character ,List<String>> res= words.stream().collect(Collectors.groupingBy(word ->word.charAt(0)));
//        System.out.println(res);


        // 35. Concatenate strings in reverse order using reduce.
//        List<String> words = Arrays.asList("Stream", "API", "is", "awesome");
//        String res = words.stream()
//                .reduce((w1,w2)->w2 + " " + w1)
//                .orElse(" ");
//        System.out.println(res);


        // 39  Find the word with the most vowels in a list.
//        List<String> words = Arrays.asList("stream", "java", "programming", "awesome");
//        String s = words.stream()
//                .max(Comparator.comparingInt(word -> (int) word.chars().filter(c -> "aeiou".indexOf(c) != -1).count()))
//                .orElse(null);
//        System.out.println(s);

        // 41 Generate the first N numbers in the Fibonacci sequence.
//        int n = 10;
//        List<Integer> collect = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
//                .limit(n)
//                .map(arr -> arr[0])
//                .collect(Collectors.toList());
//        System.out.println(collect);


        // 43  Group words by their length and sort each group alphabetically.
//        List<String> words = Arrays.asList("java", "stream", "api", "example", "code", "test");
//       Map<Integer , List<String>> res  = words.stream().collect(Collectors.groupingBy(String::length , Collectors.collectingAndThen(Collectors.toList(),
//                list -> list.stream().sorted().collect(Collectors.toList())
//                )));
//        System.out.println(res);

       // 44 Calculate the product of all numbers in a list using reduce.
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int productOfNum = numbers.stream()
//                .reduce(1,(a,b)-> a*b);
//        System.out.println("productOfNum " + productOfNum);

        // 49 Find Non-Repeating Characters in a String
//        String input ="Shivanand";
//        input.chars()
//                .mapToObj(c->(char)c)
//                .filter(c-> input.indexOf(c) == input.lastIndexOf(c))
//                .forEach(System.out::println);

       // 51  Count the frequency of each character in a string.
//        String s = "success";
//        Map<Character , Long> frequencyOfChar = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c , Collectors.counting()));
//        System.out.println(frequencyOfChar);

        // 52 Flatten a list of lists into a single list.
//        List<List<Integer>> nestedList = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8, 9)
//        );
//        List<Integer> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(flatList);


        // 53 .  Identify all duplicate elements in a list
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
//
//        Set<Integer> duplicates  = numbers.stream()
//                .filter(c-> Collections.frequency(numbers ,c)>1)
//                .collect(Collectors.toSet());
//        System.out.println(duplicates);


        // 54.Convert a map to a list of “key=value” strings.
//        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
//
//        List<String > keyValue = map.entrySet().stream()
//                .map(e->e.getKey() + "= "+ e.getValue())
//                .collect(Collectors.toList());
//        System.out.println(keyValue);


        // Q. Convert a list of strings to sentence case.
//        List<String> words = Arrays.asList("java", "stream", "api");
//        List<String > res = words.stream().map(w->w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase())
//                .collect(Collectors.toList());
//        System.out.println(res);





    }
}
