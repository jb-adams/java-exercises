/*
Write a Java program to convert minutes into a number of years and days
*/
package exercises.DataTypes;
import java.util.Scanner;

public class Ex004 {

    private static int[] convertMinutesToYearsAndDays(int minutes) {
        int totalDays = minutes / 60 / 24;
        int totalYears = totalDays / 365;
        int remainingDays = totalDays % 365;

        int[] intArray = new int[2];
        intArray[0] = totalYears;
        intArray[1] = remainingDays;

        return intArray;
    }

    public static void main(String[] args) {
        int minutes;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number of minutes: ");
        minutes = sc.nextInt();

        int[] yearsAndDays = convertMinutesToYearsAndDays(minutes);

        output = minutes + " minutes is approximately "
               + yearsAndDays[0] + " years and "
               + yearsAndDays[1] + " days.";

        System.out.println(output);

    }
}
