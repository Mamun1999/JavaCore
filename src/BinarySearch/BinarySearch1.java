package BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int [] arr={3,5,7,8,12,14};
        int target=12;
        boolean result=binarySearch(arr,12);
        if(result==true){
            System.out.println(target+" Found");
        }
        else{
            System.out.println("Not found");
        }
    }

    public static boolean binarySearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;



        while (start<end){
            int middle= start+(end-start/2);
            if(target==arr[middle]){
                return true;
            }
            else if(target>arr[middle]){
                start=middle+1;
            }
            else {
                end=middle-1;
            }
        }
        return false;
    }
}
