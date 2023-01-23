package tut1;

import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {

        int a=0;
        int b=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=input.nextInt();


        for(int i=1;i<=n;i++){
            System.out.println(a);//0 1 1 2
           int temp=b;//b=1. 1, 2
             b=a+b;//b=0+1=1 , 1+1= 2, ,1+2=3 ,
            a=temp;//1, 1, 2



        }

//       int count=2;
//
//        while (count<=n){
//            int temp=b; //1, 1, 2, 3
//            b=a+b;// 0+1 , 1+1, 1+2=3
//            a=temp;// 1, 1,
//            count++;// 3 ,4,5
//        }
//        System.out.println("r: "+b);

    }
}
