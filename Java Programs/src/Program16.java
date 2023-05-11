import java.util.Scanner;

/*Write a Java program which input any number between 1 to 7 and it print The Daysname
        MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
        number is out of selection Print message “Week contains 1 to 7 days”*/
        public class Program16 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7: ");
        int dayNum = sp.nextInt();

        String dayName;

        switch (dayNum) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
                return;
        }

        System.out.println("The day of the week is " + dayName);

    }
}


