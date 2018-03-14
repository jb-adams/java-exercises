/*
Write a Java program that reads a number in inches, converts it to metres
*/
package exercises.DataTypes;
import java.util.Scanner;

public class Ex002 {

    private static double convertInchesToMetres(double inches) {
        return inches * 0.0254;
    }

    public static void main(String[] args) {
        double inches;
        double metres;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value in inches: ");
        inches = sc.nextDouble();
        metres = convertInchesToMetres(inches);

        output = "Inches = " + inches + "\n"
               + "Metres = " + metres + "\n";

        System.out.println(output);

    }
}
