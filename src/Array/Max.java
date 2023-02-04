package Array;

public class Max {

    static int findMax(int [] arr){
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }



    public static void main(String[] args) {
        int[] arr={4,5,6,23,4,5};
        System.out.println(findMax(arr));
    }
}
