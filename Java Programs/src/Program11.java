import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
        other alphabet should be invalid entry.*/
public class Program11 {
    public static void main(String[] args) {
       Scanner sp = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char ch = sp.next().charAt(0);
        if (ch == 'A') {
            System.out.println("City name: Anand");
        } else if (ch == 'B') {
            System.out.println("City name: Baroda");
        } else if (ch == 'C') {
            System.out.println("City name:Champaner");
        } else if (ch == 'D') {
            System.out.println("City name: Dakor");
        } else if (ch == 'E') {
            System.out.println("City name: Eldersburg");
        } else if (ch == 'F') {
            System.out.println("City name: Foster city");
        } else {
            System.out.println("Invalid entry!");
        }


    }
}
