public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        return((barking) && ((0 <= hourOfDay && hourOfDay < 8) || (hourOfDay == 23)));
    }
}
