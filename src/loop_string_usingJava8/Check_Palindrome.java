package loop_string_usingJava8;

public class Check_Palindrome {

    public static void main(String[] args) {

        String str = "madam";
        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println(str + " is Palindrome");
        }else {
            System.out.println(str + " is Not Palindrome");

        }


        // using stream()

        boolean ispalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(ispalindrome);



        // rev string
        String res = new StringBuilder(str).reverse().toString();
        System.out.println(res);


        System.out.println("==============================");

        int num = 121;
        int temp=num;
        int rev1 =0;

        while(num>0){
            int rem = num%10;
            rev1 = rev1*10 + rem;
            num = num/10;
        }

        if(temp == rev1){
            System.out.println(temp + " is palindrome num");
        }else {
            System.out.println(temp + " is not palindrome ");
        }

        int number=121;
        String res12 = String.valueOf(number);
        System.out.println(res12.equals(new StringBuilder(res12).reverse().toString())
        ?" is palindrome " : " not palindrome"
        );

    }
}
