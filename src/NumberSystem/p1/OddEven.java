package NumberSystem.p1;

public class OddEven {
    public static void main(String[] args) {
        int num= 78;
        System.out.println(findOdd(num));
    }

    private static boolean findOdd(int num) {

        return (num & 1)==1;
    }

}
