package Midweekhomework;
//Print multiplication table of 24, 50 and 29 using loop.//
public class q2 {
    public static void main(String[] args) {

        int[] numbers = {24, 50, 29};

        for (int i = 0; i < numbers.length; i++) { // each number in the array.
            System.out.println("Multiplication table of " + numbers[i] + ":");
            System.out.println("------------------------");
            for (int j = 1; j <= 10; j++) { //from 1 to 10 and print the multiplication table
                int result = numbers[i] * j;
                System.out.println(numbers[i] + " x " + j + " = " + result);
            }
            System.out.println();
        }
    }
}








