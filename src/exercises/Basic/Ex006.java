/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two
numbers.
 */

package exercises.Basic;
import java.util.Scanner;

public class Ex006 {
    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int a;
        int b;
        String s = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        a = sc.nextInt();

        System.out.println("Input second number: ");
        b = sc.nextInt();

        s = a + " + " + b + " = " + add(a,b) + "\n"
          + a + " - " + b + " = " + subtract(a,b) + "\n"
          + a + " x " + b + " = " + multiply(a,b) + "\n"
          + a + " / " + b + " = " + divide(a,b) + "\n"
          + a + " mod " + b + " = " + mod(a,b) + "\n";

        System.out.println(s);

    }
}
