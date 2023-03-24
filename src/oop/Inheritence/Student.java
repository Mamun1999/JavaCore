package Inheritence;

import java.util.List;

public class Student {

    String dept;
    int age;
    List<String> coursesList;

    public Student(String dept, int age, List<String> coursesList) {
        this.dept=dept;
        this.age=age;
        this.coursesList=coursesList;

    }
    Student(Student st){
        this.dept=st.dept;
        this.age=st.age;
        this.coursesList=st.coursesList;
    }

    public Student() {
        this.dept="cse";
        this.age=22;

        // if want to create default constructor/ any constructor then my parent class should have the default constructor/ that type constructor
    }

//    public Student() {
//
//    }
}
