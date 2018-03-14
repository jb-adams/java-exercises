/*
Write a Java program to compute body mass index(BMI)
*/

package exercises.DataTypes;
import java.util.Scanner;

public class Ex006 {

    private static double computeBMI(double weight, double height) {
        return ((weight / (height * height)) * 703.0);
    }

    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input weight in pounds: ");
        weight = sc.nextDouble();

        System.out.println("Input height in inches: ");
        height = sc.nextDouble();

        bmi = computeBMI(weight, height);

        output = "weight in pounds = " + weight + "\n"
               + "height in inches = " + height + "\n"
               + "BMI = " + bmi + "\n";
        System.out.println(output);

    }
}
