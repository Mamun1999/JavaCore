package linearSearch;

public class FindEven {

    public static int evenNumCount(int[] num){
        int count=0;

            for (int nums:num) {
             if(even(nums));
             count++;

            }




        return count;
    }

    public static boolean  even(int n){
     int ans=0;



       ans=countRem(n);
       if(ans%2==0){
           return true;
       }

        return false;
    }

    public static int countRem( int n){

        int count=0;

//        for (int i = 0; i < arr.length; i++) {

            while(n>0){
                count++;
                n=n/10;

            }
//        }


        return count;
    }

    public static void main(String[] args) {
        int[] arr={234,457,678967,2,346};
        System.out.println(evenNumCount(arr));


    }
}
