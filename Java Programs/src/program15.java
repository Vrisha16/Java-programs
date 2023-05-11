import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.//
//
 public class program15 {
    public static void main(String[] args) {
       Scanner sp = new Scanner(System.in);
        System.out.print("Enter input value: ");
        String input = sp.next();
        char c = input.charAt(0);

        if (Character.isDigit(c)) {
            System.out.println("The input value is number.");
        } else if (Character.isLetter(c)) {
            System.out.println("The input value is alphabet.");
        } else {
            System.out.println("The input value is symbol.");
        }
    }
}



