/*
Write a Java program that keeps a number from the user and generates an integer between 1 and 7
and displays the name of a weekday.
*/

package exercises.ConditionalStatement;
import java.util.Scanner;

public class Ex005 {

    private static String getWeekdayFromNumber(int weekdayNum) {
        String weekday = new String();

        if (weekdayNum == 1) {
            weekday = "Monday";
        } else if (weekdayNum == 2) {
            weekday = "Tuesday";
        } else if (weekdayNum == 3) {
            weekday = "Wednesday";
        } else if (weekdayNum == 4) {
            weekday = "Thursday";
        } else if (weekdayNum == 5) {
            weekday = "Friday";
        } else if (weekdayNum == 6) {
            weekday = "Saturday";
        } else if (weekdayNum == 7) {
            weekday = "Sunday";
        }

        return weekday;
    }

    public static void main(String[] args) {
        int weekdayNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 7: ");
        weekdayNum = sc.nextInt();

        System.out.println(getWeekdayFromNumber(weekdayNum));

    }
}
