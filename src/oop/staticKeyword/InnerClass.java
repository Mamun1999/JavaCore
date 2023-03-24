package staticKeyword;
class A{  //we have to use it from here if we dont use static in that inner class
   static String name; //if we make it static then for diff object it will print the same name of diff object
    A(String name){
        A.name=name;
    }
}
public class InnerClass {

//   static class A{  // we must make it static if we run
//       static String name;
//        A(String name){
//            A.name=name;
//        }
//    }

    public static void main(String[] args) {
        A a=new A("Mamun");// it wil not work bcs of we are declaring a class that is not indepepndent and not static

        A b=new A("Rokon");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
