import java.util.Scanner;

/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
        find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/
public class Program13 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sp.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sp.nextDouble();

        System.out.print("Enter operation symbol (+, -, /, *): ");
        char op = sp.next().charAt(0);

        double result;
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '/') {
            result = num1 / num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else {
            System.out.println("Invalid operation symbol.");
            return;
        }

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}


