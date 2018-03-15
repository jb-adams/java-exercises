/*
Write a Java program to takes the user for a distance (in metrs) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
*/

package exercises.DataTypes;
import java.util.Scanner;

public class Ex007 {

    private static double convertMetersToKilometers(double meters) {
        double kilometers = meters / 1000;
        return kilometers;
    }

    private static double convertMetersToMiles(double meters) {
        double miles = meters / 1609;
        return miles;
    }

    private static double sumTimeInSeconds(double hours, double minutes, double seconds) {
        double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        return totalSeconds;
    }

    private static double sumTimeInHours(double hours, double minutes, double seconds) {
        double totalSeconds = sumTimeInSeconds(hours, minutes, seconds);
        double totalHours = totalSeconds / 3600.0;
        return totalHours;
    }

    private static String getSpeed(double distanceValue, double timeValue,
                                   String distanceUnits, String timeUnits) {
        double rate;
        String result;

        rate = Math.round((distanceValue / timeValue) * 100.0) / 100.0;
        result = Double.toString(rate) + " " + distanceUnits + "/" + timeUnits;
        return result;

    }

    public static void main(String[] args) {
        double meters;
        double hours;
        double minutes;
        double seconds;
        String output = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        meters = sc.nextDouble();
        System.out.print("Input hours: ");
        hours = sc.nextDouble();
        System.out.print("Input minutes: ");
        minutes = sc.nextDouble();
        System.out.print("Input seconds: ");
        seconds = sc.nextDouble();

        double kilometers = convertMetersToKilometers(meters);
        double miles = convertMetersToMiles(meters);
        double totalSecs = sumTimeInSeconds(hours, minutes, seconds);
        double totalHours = sumTimeInHours(hours, minutes, seconds);

        String metersPerSecond = getSpeed(meters, totalSecs, "m", "s");
        String kilometersPerHour = getSpeed(kilometers, totalHours, "km", "h");
        String milesPerHour = getSpeed(miles, totalHours, "mi","h");

        output = "Your speed in meters/seconds is " + metersPerSecond + "\n"
               + "Your speed in km/h is " + kilometersPerHour + "\n"
               + "Your speed in miles/h is " + milesPerHour + "\n";

        System.out.println(output);

    }
}
