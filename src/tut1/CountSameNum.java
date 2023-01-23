package tut1;

public class CountSameNum {

    public static void main(String[] args) {
        int x= 233453;
        int y=3;


        int count=0;


         while(x>0){


            int rem=x%10;

             if(rem==y) {
                 count++;
             }

             x=x/10;


         }
        System.out.println(count);

    }
}
