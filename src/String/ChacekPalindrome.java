package String;

import java.util.Locale;

public class ChacekPalindrome {
    public static void main(String[] args) {

        String str="";

        System.out.println(isPalindrome(str));
//       Boolean b= isPalindrome("");
//       if(b==true){
//           System.out.println("Yes palindrome");
//        }
//       else {
//           System.out.println("Not palindrome");
//       }

    }
    public static boolean isPalindrome(String str){

        str=str.toLowerCase();

        for (int i = 0; i <str.length()/2; i++) {

            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }



        }
        return true;
    }
}
