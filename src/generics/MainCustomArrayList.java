package generics;

public class MainCustomArrayList {

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
//        list.add(2);
//        list.add(4);
//        list.add(6);

        for (int i = 0; i < 16; i++) {
            list.add(2*i); // 0th pos=0, 1th pos=2, 3th pos=4 .......

        }
        list.set(5,9);
       int index= list.get(12);
        System.out.println(list);
        System.out.println(index);
    }
}
