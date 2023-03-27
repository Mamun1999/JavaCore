package generics;

public class GenericInterfaceImpl implements GenericInterface<Integer>{
    @Override
    public void add(Integer x, Integer y) {
        int result=x+y;
        System.out.println("sum: "+ result);
    }

    public static void main(String[] args) {
        GenericInterfaceImpl obj=new GenericInterfaceImpl();
        obj.add(3,4);
    }
}
