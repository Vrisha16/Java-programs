package Midweekhomework;

import java.util.Scanner;

/*Write a program to print the sum of two numbers entered by user by defining your
        own method.*/
public class q10 {
    public static void main(String[] args) {
        Scanner Jai = new Scanner(System.in);
        System.out.println("Enter the first number");//enter the first number.
        int num1 = Jai.nextInt();
        System.out.println("Enter the second number");//enter the second number.
        int num2 = Jai.nextInt();
        int sum = calculateSum(num1, num2);
        System.out.println("The sum of" + num1 + "and" + num2 + "is" + sum);//print result
    }public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}
