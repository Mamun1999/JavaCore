package tut1;

public class Reverse {

//    public static  int reverseNumber(int num){
//         String s=Integer.toString(num);
//         String reverse= new StringBuilder(s).reverse().toString();
//
//        return Integer.parseInt(reverse) ;
//    }

//    public static  String reverseNumber(String s){
//        String reverse=new StringBuilder(s).reverse().toString();
//        return reverse;
//    }
    public static void main(String[] args) {


//        System.out.println(reverseNumber("sjn4545"));
//     Reverse r=new Reverse();
//
//        System.out.println(r.reverseNumber(1543));

        int n= 535456;

int ans=0;
        while(n>0){
             int rem=n%10;
           n=n/10;
            ans=ans*10+rem;

        }
        System.out.println(ans);
    }

    }

