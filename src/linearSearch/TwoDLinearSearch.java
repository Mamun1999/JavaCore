package linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDLinearSearch {
    // Sorted array

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Take input: ");
         int [][]arr= new int[3][3];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]=in.nextInt();

            }

        }
        System.out.println("Enter what you want to search");
        int target=in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(target==arr[i][j])
                {
                    int result=arr[i][j];
                    System.out.println(result);
                }



            }



        }



    }
}
