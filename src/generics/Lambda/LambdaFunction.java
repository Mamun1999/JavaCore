package generics.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunction {

//    public static void print(ArrayList<Integer> list){
//        for (int i = 0; i < list; i++) {
//            list.add(i*2);
//
//        }
//        System.out.println(list);
//
//    }

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);


        }
//        print(list);



//        list.forEach((item)-> System.out.println(item*2));

        Consumer<Integer> num= ((item)-> System.out.println(item*2));

        list.forEach(num);




    }





}
