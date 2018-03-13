package exercises.Basic;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int product;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        num1 = sc.nextInt();

        System.out.println("Input second number: ");
        num2 = sc.nextInt();

        product = num1 * num2;

        System.out.println(
                "first number: " + num1 + "\nsecond number: " + num2 + "\nproduct: " + product
        );
    }
}
