package linearSearch;

public class fMax {

    public static void main(String[] args) {
        int [] a={34,54,1,200,3};
       int end=a.length-1;
       int ans= findMax(a,0,end);
        System.out.println(ans);

    }

    public static int findMax(int [] arr,int start, int end){

        int max=start;
        for (int i = start; i < end; i++) {

            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}
