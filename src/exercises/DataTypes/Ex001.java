/*
Write a Java program to convert temperature from Fahrenheit to Celsius degree
*/

package exercises.DataTypes;
import java.util.Scanner;

public class Ex001 {
    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0/9.0);
    }

    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = convertFahrenheitToCelsius(fahrenheit);

        output = "Fahrenheit = " + fahrenheit + "\n"
               + "Celsius = " + celsius + "\n";

        System.out.println(output);

    }




}
