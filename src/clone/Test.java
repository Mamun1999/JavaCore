package clone;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mamun=new Human("mamun",22);

        System.out.println(mamun.name);
        System.out.println(Arrays.toString(mamun.arr));
        Human mbrs= (Human) mamun.clone();
        mbrs.arr[1]=100;
        mbrs.name="alif";
        System.out.println(Arrays.toString(mbrs.arr));
        System.out.println(Arrays.toString(mamun.arr));
        System.out.println(mbrs.name);

        System.out.println(mamun.name);

//        Cloning creates a new object with the same values as the original object. The new object is a separate instance, but the values in the new object are the same as the values in
//        the original object. In other words, the new object is a shallow copy of the original object.
//
//        Deep cloning, on the other hand, creates a new object that is a complete copy of the original
//        object, including all nested objects and their values. In other words, the new object is a completely
//        independent copy of the original object, with all of its values and nested objects also copied.
//
//                To illustrate this difference, consider an example where you have an object that contains a
//        list of other objects. When you clone this object, you create a new object with a copy of the list, but the
//        list still references the same objects as the original list. If you make a change to one of the objects in
//        the list, it will affect both the original list and the cloned list.
//
//        In contrast, when you deep clone the object, you create a new object with a new list that contains copies of
//        all the objects in the original list. If you make a change to one of the objects in the new list, it will not
//        affect the original list or the other objects in the new list.





    }
}
