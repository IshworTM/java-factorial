package factorial;

import java.util.Scanner;

public class FactorialCheck {

    static int fact(int num){
        if (num == 0 || num == 1) {
            return num;
        }
        else{
            return num * fact(num - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:\n>> ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("The factorial of " + num + " is " + result);
        sc.close();
    }
}