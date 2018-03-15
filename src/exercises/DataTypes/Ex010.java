/*
Write a Java program to break an integer into a sequence of individual digits
*/

package exercises.DataTypes;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex010 {

    public static void main(String[] args) {
        int startingNumber;
        String startingString = new String();
        String output = new String();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("In six non-negative digits: ");
        startingNumber = sc.nextInt();

        startingString = Integer.toString(startingNumber);

        for (int i = 0; i < startingString.length(); i++) {
            sb.append( startingString.charAt(i) + " ");
        }

        System.out.println(sb.toString());

    }
}
