package Recursion;

import java.util.Scanner;

public class BinaryRecursion {

    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter arrays");
//         int[] arr=new int[5];
//        for (int i = 0; i < arr.length; i++) {
//             arr[i]=in.nextInt();
//        }
        int[] arr={2,4,6,7,9,12,15,25};
        int res= search(0, arr.length-1, arr, 3);
        System.out.println(res);
    }
    public static int search(int start, int end, int[] arr, int target){
//        start=0; //0th position value
//        end= arr.length-1;//last-1 position value
        int middle=0;
//
        if(start>end){
            return -1;
        }

        middle= start+(end-start)/2;

        if(arr[middle]==target){
            return middle;
        }

        if(arr[middle]<target){
           return search(middle+1,end, arr, target);
        }

        else {
            return search(start, middle-1,arr,target);
        }

    }
}
