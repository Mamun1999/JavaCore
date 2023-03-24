package staticKeyword;

public class StaticBlock {

   static int a=3;
    static int b;
    static {
        System.out.println("i am static blok");
         b=a*2;
    }

    public static void main(String[] args) {
        StaticBlock b=new StaticBlock();
        System.out.println(StaticBlock.a+"  /" +StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+"/"+StaticBlock.b);
        StaticBlock newb=new StaticBlock();

        System.out.println(StaticBlock.a+"  /" +StaticBlock.b);

    }
}
