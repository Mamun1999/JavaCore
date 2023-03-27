package generics.Lambda;

public class CalculatorWithoutLambda  {



    public static void operation(int a, int b, String type) {
      int result;
        switch (type){
            case "sum" :
                System.out.println(result = a + b);
                break;
            case "mul":
                System.out.println( result=a*b);
                break;

            case "sub":
                System.out.println(result=a-b);
                break;



            default:
                System.out.println("Ended");
        }

//       int result;
//
//        if(type=="sum"){
//            result=a+b;
//            System.out.println(result);
//        }
//       else if(type=="sub"){
//            result=a-b;
//            System.out.println(result);
//        }
//       else if(type=="mul"){
//            result=a*b;
//            System.out.println(result);
//        }
//        else{
//            System.out.println("pls enter valid type");
//        }

    }

    public static void main(String[] args) {
        operation(4,6,"sum");
        operation(4,6,"sub");
        operation(4,7,"hdjks");

    }

}
