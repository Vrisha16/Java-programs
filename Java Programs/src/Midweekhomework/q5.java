// Take two int values from user and print greatest among them.//

        package Midweekhomework;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = b.nextInt();
        System.out.println( "Enter second integer:");
        int num2 = b.nextInt();
        int greatest = num1 > num2 ? num1 : num2;
        System.out.println("The greatest integer is: " + greatest);
    }

}
