package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        for (int row = 0; row < 3; row++) {
            list.add(new ArrayList<>());// initializing// ZFirst of all we are taking an array and in that array we are injecting multiple arrays
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                 list.get(row).add(in.nextInt());
            }
            System.out.println();
        }
        System.out.println(list);
    }
}
