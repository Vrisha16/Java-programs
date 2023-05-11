import java.util.Scanner;

//Write if else condition and print your group name in console else others group name.//
//
 public class program4 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = a.nextLine();
        if (name.equals("Jai") || name.equals("Nish")) {
            System.out.println("Welcome to Group selinum!");
        } else {
            System.out.println("Welcome to Group postman!");
        }
    }
}



