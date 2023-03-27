package generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int  DEFAULT_SIZE=10; //default array size is 10; we will increase it if needed
    private int size=0;  // it will work as an index value

    public CustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];  // initializing array size is 10 // when we will create object of this class
    }

    public void add(T number){
        if(isFull()){   // if the array is full
            resize();  // then we have to resize it
        }

        data[size++]=number;  //this means size first initialize 0 index. if we add any number then it will take position in firts index then if we again add a number it will take place in 2nd index
                              // if it the array is full then it will call resize method


    }

    private void resize() {

        //increasing array by mul. 2
          Object [] temp= new Object[data.length*2];

          // now we have to copy the previous array into new increased array

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data=temp;


    }
    private  T remove(){
        T removed= (T) data[--size];  // it means it will delete the data it will override when we add  anew element
        return removed;

    }


    private boolean isFull() {
        return size==data.length; // def size is 10; if size is 10 and def.length=10 then resize it
    }

    public T get(int index){
       T value= (T)data[index];
       return value;
    }
    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//          CustomGenericArrayList<Integer> list=new CustomGenericArrayList<>();
//          list.add(23);
//          list.add(34);
//          list.add(78);
//         int x= list.get(1);
//
//        System.out.println(list);
//        System.out.println(x);

          CustomGenericArrayList<String> list2=new CustomGenericArrayList<>();
          list2.add("mamun");
          list2.add("rokon");



        System.out.println(list2);
        list2.remove();
        System.out.println();
        System.out.println(list2);
        list2.add("Nitu");
        System.out.println(list2);


    }
}
