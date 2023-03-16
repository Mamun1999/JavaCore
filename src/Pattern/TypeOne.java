package Pattern;

public class TypeOne {
    public static void main(String[] args) {
        int n=5;
        printStarone(n);
    }
    
    public static void printStarone(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
