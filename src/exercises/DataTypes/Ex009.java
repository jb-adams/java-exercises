/*
Write a Java program that accepts two integers from the user and then prints the sum,
the difference, the product, the average, the distance (the difference between integer),
the maximum (the larger of the two integers), the minimum(smaller of two integers)
*/

package exercises.DataTypes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex009 {

    public static void main(String[] args) {
        int a;
        int b;
        ArrayList<Integer> intArr = new ArrayList<>();
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        a = sc.nextInt();
        System.out.print("Enter second integer: ");
        b = sc.nextInt();

        intArr.add(a);
        intArr.add(b);
        Collections.sort(intArr);

        output = "Sum of two integers: " + (a+b) + "\n"
               + "Difference of two integers: " + (a-b) + "\n"
               + "Product of two integers: " + (a*b) + "\n"
               + "Average of two integers: " + ((a+b)/2) + "\n"
               + "Distance of two integers: " + (a-b) + "\n"
               + "Max integer: " + intArr.get(1) + "\n"
               + "Min integer: " + intArr.get(0) + "\n";

        System.out.println(output);
    }



}
