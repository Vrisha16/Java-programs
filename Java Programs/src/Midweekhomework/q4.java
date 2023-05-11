package Midweekhomework;

import java.util.Scanner;

/* Take values of length and breadth of a rectangle from user and check if it is square or not.
*/
public class q4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter length of rectangle:");
       int leangth =a.nextInt();
       System.out.println("enter length of breadth:");
        int breadth = a.nextInt();
        if (leangth==breadth){
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }

        }
    }

