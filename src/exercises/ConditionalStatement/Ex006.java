/*
Write a Java program that reads in two floating-point numbers and tests
whether they are the same up to three decimal places
*/

package exercises.ConditionalStatement;
import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        float a;
        float b;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        a = sc.nextFloat();
        System.out.print("Input floating-point another number: ");
        b = sc.nextFloat();

        if (a == b) {
            output = "They are the same.";
        } else {
            output = "They are different.";
        }

        System.out.println(output);
    }

}
