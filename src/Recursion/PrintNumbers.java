package Recursion;

public class PrintNumbers {

    public static void main(String[] args) {
        print(1);

    }

    public  static  void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);

        print(n+1);
    }

//    public static void print(int n){
//        System.out.println(n);
//        print1(2);
//    }
//    public static void print1(int n){
//        System.out.println(n);
//        print3(3);
//
//    }
//    public static void print3(int n){
//        System.out.println(n);
//    }



}
