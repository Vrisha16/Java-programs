/*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
        operator (? :)*/

public class Program1 {
    public static void main(String[] args) {
     int a = 10; //input number
        String result = a % 2 == 0 ? "even": "odd"; //input number is even
        System.out.println(a + "is" + result + "." );// Printb out the input number and the result


    }
}



