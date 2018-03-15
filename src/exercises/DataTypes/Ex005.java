/*
Write a Java program that prints the current time in GMT.
*/

package exercises.DataTypes;

public class Ex005 {
    public static void main(String[] args) {
        String output = new String();

        long totalMillisecs = System.currentTimeMillis();
        long totalSecs = totalMillisecs / 1000;
        long totalMinutes = totalSecs / 60;
        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        long currentMinute = totalMinutes % 60;
        long currentSecond = totalSecs % 60;

        output = "Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond;

        System.out.println(output);


    }
}
