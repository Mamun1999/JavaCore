package exceptions;

public class method {

    public static int divide(int a, int b) {
//        if(b==0){
//            throw new CustomException("Do not enter zero");
//        }
        return  a/b;


    }

    public static void main(String[] args) throws Exception {

        int a=4;
        int b=0;



      try {
          if(b==0){
           throw new CustomException("you entered 0");
          }
      } catch (CustomException e) {
          System.out.println(e.getMessage());
      }
    }



}
