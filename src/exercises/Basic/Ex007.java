/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
 */

package exercises.Basic;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        int value;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        value = sc.nextInt();

        for (int i = 1; i <= 10; i ++) {
            String s = new String();
            s = value + " x " + i + " = " + (value * i);

            System.out.println(s);
        }
    }
}
