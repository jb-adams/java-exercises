/*
write a Java program to print the area and perimeter of a rectangle
*/

package exercises.Basic;
import java.util.Scanner;

public class Ex013 {
    private static double computePerimeter(double width, double height) {
        double perimeter = (2*width) + (2*height);
        return perimeter;
    }

    private static double computeArea(double width, double height) {
        double area = width * height;
        return area;
    }

    public static void main(String[] args) {
        double width;
        double height;
        double perimeter;
        double area;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();

        perimeter = computePerimeter(width, height);
        area = computeArea(width, height);

        output = "Height = " + height + "\n"
               + "Width = " + width + "\n"
               + "Perimeter = " + perimeter + "\n"
               + "Area = " + area + "\n";

        System.out.println(output);




    }
}
