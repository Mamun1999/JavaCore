package Recursion;

public class Fibonacci {

    //enter the position of fibonacci series and find a value of that position
    public static void main(String[] args) {

        int fibRes=fibRecursion(4);
        System.out.println(fibRes);

//        printArray(5);
//        System.out.println();
//        int res=getValue(6);
//        System.out.println(res);
    }

    public  static int fibRecursion(int num){

        if(num<2){
            return num;
        }

        return fibRecursion(num-1)+fibRecursion(num-2);
    }

//    public static void printArray(int num) {
//
//        int first = 0;
//        int second = 1;
//        System.out.print(first + " " + second);
//        int fib = 0;
//        for (int i = 2; i < num; i++) {
//
//            int next = first + second;
//            System.out.print(" " + next);
//            first = second;
//            second = next;
//
//
//        }
//    }
//
//        public static int getValue(int n){
//
//            int n1=0;
//            int n2=1;
//            int next=0;
//
//            for (int i = 2; i < n; i++) {
//                next=n1+n2;
//                n1=n2;
//                n2=next;
//            }
//            return next;
//        }
//
//
//


}
