package Midweekhomework;

import java.util.Scanner;

/*Take 10 integers from keyboard using loop and print their average value on the
        screen.*/
public class q1 {
    public static void main(String[] args) {
        Scanner Jai = new Scanner (System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = Jai.nextInt();
            sum += num;
        }
        double average = (double) sum / 10;
        System.out.println("The average of the 10 numbers is: " + average);
    }
}


