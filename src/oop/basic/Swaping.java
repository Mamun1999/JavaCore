package basic;

public class Swaping {

    public static void main(String[] args) {
        int a =10;
        int b=50;
        swap(a,b);
        System.out.println(a+" "+b);
    }
// java has no such thing that pass by reference
    //Everything in java is pass value
    public static void swap(int a, int b){
        ////swap will not happen bcs a and b just passing value only in this method
        int temp=a;
        a=b;
        b=temp;
    }


}
