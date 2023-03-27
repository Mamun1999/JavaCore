package generics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        Student mamun=new Student(23, 50);
        Student naim= new Student(24, 40 );
        Student nitu= new Student(25, 33 );
        Student mitu= new Student(26, 55 );
        Student alif= new Student(27, 90 );
        Student arnab= new Student(28, 85 );

//        ArrayList<Student> list=(mamun,naim,nitu,mitu,alif,arnab};

        Student[] list= new Student[]{mamun, naim, nitu, mitu, alif, arnab};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.marks-o2.marks;
//            }
//        });
        Arrays.sort(list, ((o1, o2) -> o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));








//        if(mamun.compareTo(naim)<0){
//            System.out.println("Naim has more marks");
//        }
//        else{
//            System.out.println("mamun has more marks");
//        }

//        if(mamun<naim){
//            System.out.println("naim has more marks"); // java compiler will find which paramter u are comaparing? this is not the right way to do it
//        }


    }
}
