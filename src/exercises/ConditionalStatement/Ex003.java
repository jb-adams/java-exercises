/*
Take three numbers from the user and print the greatest number.
*/
package exercises.ConditionalStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex003 {

    private static int getLargest(ArrayList<Integer> intArray) {
        int largest;

        Collections.sort(intArray);
        largest = intArray.get(intArray.size() - 1);

        return largest;
    }

    public static void main(String[] args) {
        int first;
        int second;
        int third;
        int largest;
        String output = new String();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<Integer>(3);

        System.out.println("Enter the first number: ");
        first = sc.nextInt();
        System.out.println("Enter the second number: ");
        second = sc.nextInt();
        System.out.println("Enter the third number: ");
        third = sc.nextInt();

        intArray.add(first);
        intArray.add(second);
        intArray.add(third);

        largest = getLargest(intArray);

        output = "First number: " + first + "\n"
               + "Second number: " + second + "\n"
               + "Third number: " + third + "\n"
               + "Largest number: " + largest + "\n";

        System.out.println(output);

    }
}
