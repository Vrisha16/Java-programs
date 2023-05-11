import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and then
        fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
        < 10,000 2%    */
public class Program10 {
    public static void main(String[] args) {
       Scanner sp = new Scanner(System.in);


        System.out.print("Enter Sales ID: ");//Sales ID.
        int salesID = sp.nextInt();
        System.out.print("Enter Seller's Name: ");//Seller's name.
        String sellerName = sp.next();
        System.out.print("Enter Sales Amount: ");// Sales amount.
        double salesAmount = sp.nextDouble();
        System.out.print("Enter Basic Salary: ");// Basic salary.
        double basicSalary = sp.nextDouble();
        double salesCommission = 0;
        if (salesAmount >= 50000) {
            salesCommission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            salesCommission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            salesCommission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            salesCommission = salesAmount * 0.05;
        } else {
            salesCommission = salesAmount * 0.02;
        }
        double totalSalary = basicSalary + salesCommission;//count total salary

        System.out.println("Sales Commission: " + salesCommission); // print sales commission and total salary
        System.out.println("Total Salary: " + totalSalary);
    }






    }

