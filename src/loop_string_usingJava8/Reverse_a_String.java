package loop_string_usingJava8;

public class Reverse_a_String {

    public static void main(String[] args) {

        usingLoop();
        usingStream();
    }

    public static void usingLoop(){
        String str = "java";
        String rev="";

        for(int i=str.length() -1 ; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void usingStream(){

        String rev = new StringBuilder("Shivanand").reverse().toString();
        System.out.println(rev);





    }
}
