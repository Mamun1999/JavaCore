package Abstract;

public class B extends  A{


    public B(String age) {
        super(age);
    }

    @Override
    void sub() {
        System.out.println("This is sub method");
    }

    public void print(){
        System.out.println("print method");
    }
}
