package Midweekhomework;

import java.util.Scanner;

/*Modify the question 8 to allow student to sit if he/she has medical cause. Ask
        user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
public class q9 {
    public static void main(String[] args) {
        Scanner Jai = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int classesHeld = Jai.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int classesAttended = Jai.nextInt();

        // Calculate the attendance percentage
        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;

        System.out.print("Do you have a medical cause for your low attendance? (Y/N): ");
        String hasMedicalCause = Jai.next();
        if (attendancePercentage < 75 && hasMedicalCause.equalsIgnoreCase("N")) {
            System.out.println("You have attended " + attendancePercentage + "% of classes.");
            System.out.println("You are not allowed to sit in the exam.");
        } else {
            System.out.println("You have attended " + attendancePercentage + "% of classes.");
            System.out.println("You are allowed to sit in the exam.");
        }
    }
}










