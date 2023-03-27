package generics.Lambda;

public class Calculator {


    int a;
    int b;
    private  int operate(int a, int b,Operation op) {
        return op.operation(a,b);
    }
   Operation sum= Integer::sum;
    Operation sub=(a,b) ->a-b;
    Operation mul=(a,b)->a*b;

    public static void main(String[] args) {

    Calculator cal=new Calculator();
      int a=  cal.operate(3,4, cal.sum);
        System.out.println(a);

    }


}
