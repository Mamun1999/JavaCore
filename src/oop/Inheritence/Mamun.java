package Inheritence;

import java.util.List;

public class Mamun extends Student {

   String name;
   String address;
   int age;

   public Mamun(){
       super();
       this.age=super.age;// super class age value will be initialize here
       this.address="Jaldhaka";
   }

    public Mamun(String dept, int age, List<String> coursesList, String name) {
        super(dept, age, coursesList); // here super is indicating the super class constructor
        this.name=name;
        this.age=super.age;// this will call Student class age not this class age
    }



    public Mamun(Mamun m){
        super(m);
     this.name="mamun";
     this.address="rangpur";
     this.age=60;

    }



}
