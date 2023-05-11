import java.util.Scanner;

/*Write a java program to get numbers from users and print whether it is positive or negative.
*/ public class Program8 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sp.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        }
        }
    }

