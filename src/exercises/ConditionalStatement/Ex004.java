/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is
less than 1, or "large" if exceeds 1,000,000.
*/

package exercises.ConditionalStatement;
import java.util.Scanner;

public class Ex004 {

    private static String checkSign(float number) {
        String result = "zero";

        if (number == 0) {
            result = "zero";
        } else if (number < 0 ) {
            result = "negative";
        } else if (number > 0) {
            result = "positive";
        }

        return result;
    }

    private static String checkSize(float number) {
        String result = "small";

        float absNumber = Math.abs(number);
        if (absNumber < 1) {
            result = "small";
        } else if ((absNumber >= 1) && (absNumber < 1000000)) {
            result = "medium";
        } else if (absNumber >= 1000000) {
            result = "large";
        }

        return result;
    }

    public static void main(String[] args) {
        float number;
        String sign;
        String size;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a floating point number: ");
        number = sc.nextFloat();
        sign = checkSign(number);
        size = checkSize(number);

        output = "Input number = " + number + "\n"
               + "This is a " + size + " " + sign + " number.\n";
        System.out.println(output);
    }
}
