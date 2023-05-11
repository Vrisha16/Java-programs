package Midweekhomework;
/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print
        percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner Jai = new Scanner(System.in);
        System.out.println("Enter the number of class held ");//number of class held.
        int classHeld = Jai.nextInt();
        System.out.println("Enter the number of class attended");//number of class attended.
        int classAttended = Jai.nextInt();
        System.out.println("Enter the number of class percentage");//number of class percentage.
        int classPercentage = Jai.nextInt();
        double attendancePercentage = ((double) classAttended / classHeld) * 100;//Attended percentage.
        if (attendancePercentage < 75) {
            System.out.println("You have attended " + attendancePercentage + "% of classes.");
            System.out.println("You are not allowed to sit in the exam.");
        } else {
            System.out.println("You have attended " + attendancePercentage + "% of classes.");
            System.out.println("You are allowed to sit in the exam.");
        }
    }



    }

