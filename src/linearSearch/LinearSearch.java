package linearSearch;

public class LinearSearch {

    public static boolean search(int[]x,int target){

        for (int i = 0; i < x.length; i++) {
            if(x[i]==target){
                return true;
            }

        }
    return  false;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(search(arr,8));
    }


//    public static  boolean search(int [] arr, int target){
//
//        for (int index = 0; index < arr.length; index++) {
//            int element=arr[index];
//            if(element==target){
//                return true;
//            }
//
//
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int [] arr={34,45,3,7,4,15};
//       boolean result= search(arr, 15);
//
//       if (result==true){
//           System.out.println("Number matched");
//       }
//       else {
//           System.out.println("number did not find");
//       }
//
//    }
}
