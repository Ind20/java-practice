package problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int fact = 1;

        if (n<0){
            System.out.println("invalid number");
        }else {
            for (int i = 1; i<=n; i++){
                fact = fact * i;
            }
        }

        System.out.println(fact);
    }
}
