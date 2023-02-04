package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {

        int[] arr={4 , 2,3,9,8,1};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void selectionSort(int []arr){

        for (int i = 0; i < arr.length; i++) {
            //we need last index bcs max value is going to swap there
            int lastIndex= arr.length-i-1; //arr 5; last=5-0-1=4-> 0,1,2,3,4;

           int max= getMaximum(arr, 0,lastIndex);
            swapping(arr, max, lastIndex);
        }

    }

    public static void swapping(int [] arr,int first,int second){

            int max=arr[first];
            arr[first]=arr[second];
            arr[second]=max;




            }


    public static int getMaximum(int[] arr,int start, int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                  max=i;
            }

        }
        return max;
    }
}
