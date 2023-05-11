import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
        marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
        should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        |
        |

        Mark Sheet

        |
        |

        |
        |
        |
        Name
        Roll No

        : 08
        : 23

        J
        a
        y
        |
        |
        |
        | |
        | Subjects : Marks |
        | |
        | Math : 98 |
        | Science: : 90 |
        | English : : 85 |
        | |
        | Total : 273 |
        | |
        | Percentage : 91.0 |
        | Result : Pass |
        | Grade : A+ |
        |             |
 */
        public class program5 {
    public static void main(String[] args) {
        Scanner Jai = new Scanner(System.in);
        System.out.println("Enter student details ");//Student Details.
        System.out.println("Name");
        String name = Jai.nextLine();
        System.out.println("Roll NO");
        int rollNo = Jai.nextInt();
        System.out.println("Enter marks for 3 subjects (out of 100):");//enter marks
        System.out.print("Math: ");
        int mathMarks = Jai.nextInt();
        System.out.print("Science: ");
        int scienceMarks = Jai.nextInt();
        System.out.print("English: ");
        int englishMarks = Jai.nextInt();
        int totalMarks = mathMarks + scienceMarks + englishMarks;//calculate total marks, percentage and result
        double percentage = (double) totalMarks / 3;
        String result = percentage >= 35 ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print mark sheet
        System.out.println("\n|----------------------------------|");
        System.out.println("|           Mark Sheet             |");
        System.out.println("|----------------------------------|");
        System.out.println("| Name\t\t: " + name);
        System.out.println("| Roll No.\t: " + rollNo);
        System.out.println("|----------------------------------|");
        System.out.println("| Subjects\t: Marks");
        System.out.println("|----------------------------------|");
        System.out.println("| Math\t\t: " + mathMarks);
        System.out.println("| Science\t: " + scienceMarks);
        System.out.println("| English\t: " + englishMarks);
        System.out.println("|----------------------------------|");
        System.out.println("| Total\t\t: " + totalMarks);
        System.out.println("| Percentage\t: " + percentage);
        System.out.println("| Result\t\t: " + result);
        System.out.println("| Grade\t\t: " + grade);
        System.out.println("|----------------------------------|");
    }

}












