/*
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the
integer
*/
package exercises.DataTypes;
import java.util.Scanner;

public class Ex003 {

    private static int addDigits(int input) {
        int sum = 0;
        String inputAsString = Integer.toString(input);

        for (int i = 0; i < inputAsString.length(); i++) {
            char c = inputAsString.charAt(i);
            sum += Character.getNumericValue(c);
        }

        return sum;
    }

    public static void main(String[] args) {
        int input;
        int digitSum;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000: ");
        input = sc.nextInt();

        digitSum = addDigits(input);

        output = "Input Number = " + input + "\n"
               + "Output Number = " + digitSum + "\n";
        System.out.println(output);
    }
}
