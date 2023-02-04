package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static  void swap(int[] arr, int x, int y){

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    public static void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;
        if(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("After swapping: ");
//        swap(arr, 1,4);
//        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
