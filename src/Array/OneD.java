package Array;

import java.util.Arrays;
import java.util.Scanner;

public class OneD {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values: ");

         int [] arr=new int[5];
        for (int i = 0; i<arr.length; i++) {

            arr[i]= sc.nextInt();

        }
  //printing-1
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//
//        }

        //printing-2
//        System.out.println(Arrays.toString(arr));

//        printing-3
        for (int val: arr
             ) {
            System.out.println(val);
        }


    }
}
