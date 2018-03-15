/*
Write a Java program that reads a number and displays the square, cube, and fourth power
*/

package exercises.DataTypes;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex008 {

    public static void main(String[] args) {
        double number;
        ArrayList<Double> powers = new ArrayList<Double>();
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = sc.nextInt();

        for (int i = 2; i <=4; i++) {
            double a = i;
            powers.add(Math.pow(number,a));
        }

        output = "Input value: " + number + "\n"
               + "Square: " + powers.get(0) + "\n"
               + "Cube: " + powers.get(1) + "\n"
               + "Fourth power: " + powers.get(2) + "\n";
        System.out.println(output);
    }
}
