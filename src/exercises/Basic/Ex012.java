/*
Write a Java program that takes three numbers as input to calculate and print the average of three
numbers
*/
package exercises.Basic;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex012 {
    private static double avg(ArrayList<Double> arr) {
        double avg;
        double sum = 0.0;

        for (int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }

        avg = sum / arr.size();

        return avg;
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double avg;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();

        System.out.println("Enter first number: ");
        a = sc.nextDouble();
        System.out.println("Enter second number: ");
        b = sc.nextDouble();
        System.out.println("Enter third number: ");
        c = sc.nextDouble();

        myList.add(a);
        myList.add(b);
        myList.add(c);

        avg = avg(myList);
        System.out.println(avg);

    }

}
