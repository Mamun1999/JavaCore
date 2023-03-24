package staticKeyword;

public class StaticMethod {

    public static void main(String[] args) {
        StaticMethod.print1();
        StaticMethod s=new StaticMethod();
        s.nonStatic();
    }


    public static void print1(){
        System.out.println("I am static method 1");
//        nonStatic(); // we can not call a nonstatic in static
        StaticMethod staticMethod =new StaticMethod();//if we wn to se non static in static then we have to create object
        staticMethod.nonStatic();
    }

    public void nonStatic(){
        System.out.println("I am not static method");
        this.nonStatic2();
        print1();// we can call non static in static bcz  we run the main  method and it is is static method.
    }

    public void nonStatic2(){
        System.out.println("I am not static method2");
    }

}
