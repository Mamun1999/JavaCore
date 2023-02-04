package BinarySearch;

public class AgnosticBinarySearch {

    public static void main(String[] args) {
        int [] arr={34,4,3,2};
        int target=3;
        boolean result=binarySearch(arr,566);
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

        boolean isAscending;
        if(arr[start]<arr[end]){
            isAscending=true;
        }
        else
        {
            isAscending=false;
        }

        while (start<end){
            int middle= start+(end-start/2);
            if(target==arr[middle]){
                return true;
            }
           if(isAscending){

                if(target>arr[middle]){
                   start=middle+1;
               }
               else {
                   end=middle-1;
               }
           }
           else{

                if(target<arr[middle]){
                   start=middle+1;
               }
               else {
                   end=middle-1;
               }
           }
        }
        return false;
    }
}
