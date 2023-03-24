package Inheritence;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("se");
        list.add("ds");
//
//        Mamun m= new Mamun("se",22,list , "Abdullah");
//        System.out.println(m.dept+m.name+m.age);
//        Mamun m5=new Mamun(m);
//        System.out.println( m5.age+m5.name+m5.dept);

        ///without prameter

        Mamun withoutP=new Mamun();
        System.out.println(withoutP.address+"\n"+withoutP.age+"\n"+withoutP.dept);

//      Student s=new Student("cse", 25, list);
//      Student s2=new Student(s);
//        System.out.println("///////");
//        System.out.println(s2.age+s2.dept+s2.coursesList);
//
//
//        System.out.println(m.dept+"  \n "+m.coursesList+  "  \n " +m.name);
//        Mamun m2=new Mamun();
//        System.out.println("\n"+m2.name);


    }
}
