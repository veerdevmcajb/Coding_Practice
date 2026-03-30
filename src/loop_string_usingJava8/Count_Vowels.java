package loop_string_usingJava8;

public class Count_Vowels {
    public static void main(String[] args) {

        String str = "java";
        int count =0;

        for(char c : str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                count ++;
            }
        }

        System.out.println("Count using loops "+ count);


        // using Stream

        long charCount = str.toLowerCase().chars().filter(c->"aeiou".indexOf(c)!=-1).count();
        System.out.println("Count using stream "+ charCount);
    }
}

// Note : stream chars() methods is converted String to Integer stream.