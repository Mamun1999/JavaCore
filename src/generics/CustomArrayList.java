package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int [] data;
    private static int  DEFAULT_SIZE=10; //default array size is 10; we will increase it if needed
    private int size=0;  // it will work as an index value

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];  // initializing array size is 10 // when we will create object of this class
    }

    public void add(int number){
        if(isFull()){   // if the array is full
            resize();  // then we have to resize it
        }

        data[size++]=number;  //this means size first initialize 0 index. if we add any number then it will take position in firts index then if we again add a number it will take place in 2nd index
                              // if it the array is full then it will call resize method


    }

    private void resize() {

        //increasing array by mul. 2
          int [] temp= new int[data.length*2];

          // now we have to copy the previous array into new increased array

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data=temp;


    }
    private  int remove(){
        int removed=data[--size]; // it means it will delete the data it will override when we add  anew element
        return removed;

    }


    private boolean isFull() {
        return size==data.length; // def size is 10; if size is 10 and def.length=10 then resize it
    }

    public int get(int index){
       int value= data[index];
       return value;
    }
    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index]=value;
    }



    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
