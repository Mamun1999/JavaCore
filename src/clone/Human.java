package clone;

public class Human implements Cloneable {
    String name;
    int age;

    int [] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{3,4,5,7,9};
    }

    public Object clone() throws CloneNotSupportedException {

       return super.clone();

//       Human human= (Human) super.clone(); //shallow cloning

//        deep cloning
//        human.name=this.name;
//     human.arr=new int[this.arr.length]; //initializing deep copy
//
//
//        for (int i = 0; i < this.arr.length; i++) {
//            human.arr[i]=this.arr[i]; //putting the same array into the new one then we cant change array that is called deep clone
//        }
//
//        return human;


    }


//     public Human(Human human){
//        this.name=human.name;
//        this.age=human.age;
//     }
}
