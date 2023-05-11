import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
        | Salary Slip |
        | |
        | |
        | Employee Id : 2564 |
        | Employee Name : Jay |
        |
        |
        | Basic Salary : 25000.0 |
        | HRA 10% : 2500.0 |
        | TA 8% : 2250.0 |
        | DA 9% : 2000.0 |
        | PF - 20& : 5000.0 |
        |
        |
        | Gross Salary : 26750.0 |
        |===========================|

 */
public class program6 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int empID = sp.nextInt();
        System.out.println("Enter Employee Name");
        String empName = sp.next();
        System.out.println("EnterBasic Salary");
        Double basicSalary = sp.nextDouble();

        double hra = 0.1 * basicSalary;
        double ta = 0.08 * basicSalary;
        double da = 0.09 * basicSalary;
        double pf = 0.2 * basicSalary;

        double grossSalary = basicSalary + hra + ta + da - pf;
        System.out.println("| Salary Slip |");
        System.out.println("|             |");
        System.out.println("| Employee Id : " + empID + " |");
        System.out.println("| Employee Name : " + empName + " |");
        System.out.println("|             |");
        System.out.println("| Basic Salary : " + basicSalary + " |");
        System.out.println("| HRA 10% : " + hra + " |");
        System.out.println("| TA 8% : " + ta + " |");
        System.out.println("| DA 9% : " + da + " |");
        System.out.println("| PF - 20% : " + pf + " |");
        System.out.println("|             |");
        System.out.println("| Gross Salary : " + grossSalary + " |");
        System.out.println("|===========================|");

    }
}
