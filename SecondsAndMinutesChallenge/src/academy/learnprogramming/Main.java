package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(35));
        System.out.println(getDurationString(243));
        System.out.println(getDurationString(-43));
        System.out.println(getDurationString(43, 32));
        System.out.println(getDurationString(35, 84));
        System.out.println(getDurationString(352, 14));
        System.out.println(getDurationString(-12, 43));
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return (hours + "h " + remainingMinutes + "m " + seconds + "s");
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid value";
        }
    }
}
