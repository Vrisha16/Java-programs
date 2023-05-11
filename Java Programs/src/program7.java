//Write a java program to input any number and find out if it’s odd or even.//

import java.util.Scanner;

public class program7 {
     public static void main(String[] args) {
        Scanner Jai = new Scanner(System.in);

         System.out.print("Enter a number: ");
         int number = Jai.nextInt();

         if (number % 2 == 0) {
             System.out.println(number + " is even.");
         } else {
             System.out.println(number + " is odd.");
         }
     }
}
