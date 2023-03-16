package InsertionSort;

import java.util.Arrays;

public class SortInsertion {

    public static void main(String[] args) {
        int[] array={5,3,4,1,2};

        sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                 if(arr[j]<arr[j-1]){
                     swap(arr, j,j-1);
                 }
                 else {
                     break;
                 }
            }

        }
    }

    public static void swap(int [] arr, int x, int sv){



            int temp=arr[x];
            arr[x]=arr[sv];
            arr[sv]=temp;




    }


}
