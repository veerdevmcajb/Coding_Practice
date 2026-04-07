package StreamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStream {

    public static void main(String[] args) {

        List<String> list = List.of("Nilesh", "Mahen", "Akshay", "Vijay", "Akash", "Shiva", "Natha", "Chetanya","madam");

        // 1 Q1.  Print all names in the list.
//        list.forEach(System.out::println);

        // Q2.  Get names starting with 'A'.
//        List<String>res = list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
//        System.out.println(res);

//        Q3.  Get names with length greater than 5.
//        list.stream().filter(e->e.length() > 5).forEach(System.out::println);
//
//        Q4.  Convert all names to uppercase.
//        list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
//
//        Q5.  Convert all names to lowercase.
//              list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);

//        Q6.  Count total number of names.
//            long count = list.stream().count();
//         System.out.println("Count is "+ count);

//                Q7.  Check if any name is "Alice".
//       boolean res = list.stream().anyMatch(name->name.equals("Alice"));
//        System.out.println(res);

//            Q8.  Get first name in the list.
//        list.stream().limit(1).forEach(System.out::println);

//                Q9.  Sort names alphabetically.
//        list.stream().sorted(String::compareTo).forEach(System.out::println);
//
//        Q10. Remove duplicate names (case sensitive).
//        list.stream().distinct().forEach(System.out::println);

//        Q11. Get names that contain letter 'a' (case insensitive).
//        List<String> a = list.stream().filter(e -> e.contains("a")).toList();
//        System.out.println(a);


//        Q12. Get distinct names ignoring case.

//        list.stream().distinct().forEach(System.out::println);


//        Q13. Join all names with " , " separator.
//        String s = list.stream().collect(Collectors.joining(","));
//        System.out.println(s);

//                Q14. Get names sorted by their length.
//            list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


//                Q15. Get longest name in the list.
//        Optional<String> max = list.stream().max(Comparator.comparingInt(String::length));
//        System.out.println(max);


//                Q16. Get shortest name in the list.
//     Optional<String> minlengthName = list.stream().min(Comparator.comparingInt(String::length));
//        System.out.println(minlengthName);

//                Q17. Count names that start with vowel (a, e, i, o, u).

//        long count = list.stream()
//                .map(String::toLowerCase)
//                .filter(e -> e.startsWith("a") || e.startsWith("e") ||
//                        e.startsWith("i") || e.startsWith("o") ||
//                        e.startsWith("u")).count();
//        System.out.println(count);


//                Q18. Reverse each name and print.
//        list.stream().map(e-> new StringBuilder(e).reverse().toString()).forEach(System.out::println);

//        Q19. Get names whose length is even.

//        list.stream().filter(n->n.length() % 2 == 0).forEach(System.out::println);

//        Q20. Check if all names have length greater than 2.
//        boolean res = list.stream().allMatch(n->n.length() > 2);
//        System.out.println(res);

//        Q21. Find duplicate names (case insensitive).
//          list.stream().distinct().forEach(System.out::println);


//        Q22. Get names sorted by length then alphabetically.
//            list.stream()
//                    .sorted(Comparator.comparingInt(String::length)
//                            .thenComparing(String::compareTo))
//                    .forEach(System.out::println);


//        Q23. Count frequency of each name (case insensitive).
//        Map<String, Long> fre = list.stream().collect(Collectors.groupingBy(names-> names.toLowerCase() , Collectors.counting()));
//        System.out.println(fre);

//        Q24. Get top 3 longest names.


//        Q25. Find names that are palindrome (eg: "aba").
        list.stream().filter(e->e.equals(new StringBuilder(e).reverse().toString()))
                       .forEach(System.out::println);


//        Q26. Get sentences that contain the word "Java".


//         Q27. Count total words in all sentences combined.

//        Q28. Get all unique words from all sentences.

//         Q29. Find sentence with maximum number of words.

//        Q30. Get words from all sentences sorted alphabetically.


    }
}
