/*
Write a Java program to print the area and perimeter of a circle
*/
package exercises.Basic;
import java.util.Scanner;

public class Ex011 {

    private static double perimeter(double radius) {
        double diameter = radius * 2;
        double perimeter = diameter * Math.PI;

        return perimeter;
    }

    private static double area(double radius) {
        double area = Math.PI * (radius * radius);

        return area;
    }

    public static void main(String[] args) {
        double radius;
        String s = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        s = "Radius = " + radius + "\n"
          + "Perimeter = " + perimeter(radius) + "\n"
          + "Area = " + area(radius) + "\n";

        System.out.println(s);

    }
}
