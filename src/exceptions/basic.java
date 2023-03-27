package exceptions;

public class basic {

    public static void main(String[] args) {
        int a=2;
        int b=0;
        int rs;

        try {
            rs=a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
