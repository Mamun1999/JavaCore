package staticKeyword;

public class SingleTon {
    private static   SingleTon singleTon;

    private  SingleTon(){

    }

    public  static SingleTon  getInstance(){
        if(singleTon==null){
            SingleTon singleTon=new SingleTon();
            System.out.println("same object");
        }
        return singleTon;
    }



}
class Main{
    public static void main(String[] args) {
      //        SingleTon s1=new SingleTon();
        SingleTon s1=SingleTon.getInstance();
        SingleTon s2=SingleTon.getInstance();// this to are poniting in the same object
    }
}
