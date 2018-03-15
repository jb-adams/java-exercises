/*
Write a Java program to get a number from the user and print whether it is positive or negative
*/
package exercises.ConditionalStatement;
import java.util.Scanner;

public class Ex001 {

    private static boolean checkIfPositive(int number) {
        boolean check;

        if (number > 0) {
            check = true;
        } else {
            check = false;
        }

        return check;
    }

    public static void main(String[] args) {
        int number;
        boolean check;
        String output = new String();
        String clause = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive or negative integer: ");
        number = sc.nextInt();
        check = checkIfPositive(number);

        if (check) {
            clause = "Number is positive";
        } else {
            clause = "Number is negative";
        }

        output = "Your number: " + number + "\n" + clause + "\n";
        System.out.println(output);
    }
}
