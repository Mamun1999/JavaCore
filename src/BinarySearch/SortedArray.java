package BinarySearch;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[][] arr= {
                {12, 15, 19},
                {22,24,30},
                {32,35,78}
        };

        System.out.println(Arrays.toString(search(arr,32)));
    }

    public static int[] search(int [][] matrix, int target){

        int x=0;
        int y= matrix.length-1;

        while (x<matrix.length && y>=0){
            if(matrix[x][y]== target){
                return new int[]{x,y};
            }
            if(target>matrix[x][y]){
                x++;
            }
            else{
                y--;
            }
        }
        return new int[]{-1,-1};
    }
}
