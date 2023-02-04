package BubbleSort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Buble {

    public static void main(String[] args) {
        int []arr={5,4,3,2,1};

        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void bubleSort(int @NotNull [] arr){

        for (int i = 0; i < arr.length; i++) {//order of n2
            boolean swapped=false;
            for (int j = 1; j < arr.length-i; j++) { //after first swap hgher value will go to end and it will be sorted. thats hwy we taking length-1

                if(arr[j]<arr[j-1]){
                    int swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                    swapped=true;
               }
            }


        if(!swapped){
            break;// if the array is already sorted there is no need to. swap
        }
        }

    }
}
