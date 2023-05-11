package Midweekhomework;

import java.util.Scanner;

/*Take input of age of 3 people by user and determine oldest and youngest among
them.*/
        public class q7 {
        public static void main(String[] args) {
               Scanner d = new Scanner(System.in);
                System.out.println( "Enter age of person 1");//age of 1 people
                 int age1 = d.nextInt();
                System.out.println( "Enter age of person 2");//age of 2 people
                int age2 = d.nextInt();
                System.out.println( "Enter age of person 3");//age of 3 people
                int age3 = d.nextInt();
                int oldest = age1 > age2 ? ( age1 > age3? age1: age3) :  (age2 > age3 ? age2 : age3);//int oldest to youngest of 3 people
                int youngest = age1 < age2 ? (age1 < age3 ? age1 : age3) : (age2 < age3 ? age2 : age3);//int youngest to oldest of 3 people
                System.out.println("Oldest: " + oldest);// oldest age in console.
                System.out.println("Youngest: " + youngest);//youngest age in console.


        }


}
