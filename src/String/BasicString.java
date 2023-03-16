package String;

public class BasicString {


    public static void main(String[] args) {

        String s= "mamun";// store in heap in seperate memory o called string pool

        String m=new String("mamun");

        StringBuilder sb=new StringBuilder("mamun ");// store outside of string pool

        if(s==m){//== this check reference that store in heap // equals check the value
            System.out.println("object are same");

        }
        else {
            System.out.println("Difff");
        }

    }
}
