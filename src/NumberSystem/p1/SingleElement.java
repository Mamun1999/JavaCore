package NumberSystem.p1;

import org.jetbrains.annotations.Contract;

public class SingleElement {

    public static void main(String[] args) {
        int arr []={2,3,9,4,4,3,6,2,6};


        System.out.println((int)findSingleElement(arr));
    }

    @Contract(pure = true)
    private static int findSingleElement(int[] arr) {

        int unique=0;

        for (int x: arr) {
            unique=unique^x;
        }
        return unique;
    }

}
