package tut1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int ans=0;


        while (true){
            System.out.println("Enter operator: ");
            char op=input.next().trim().charAt(0);
            if(op=='+' || op== '-'|| op== '*'|| op=='/'|| op=='%'){

                System.out.println("Enter two number: ");
                int num1=input.nextInt();
                int num2=input.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(num2!=0){
                    if(op=='/'){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                else if(op=='x' || op=='X'){
                    break;
                }
                else {
                    System.out.println("Please enter right input");
                }
                System.out.println("Ans is: "+ans);
            }

        }
    }
}
