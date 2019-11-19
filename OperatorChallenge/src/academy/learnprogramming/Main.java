package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double result = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("Result = " + result);
        double remainder = result % 40.00d;
        boolean isRemainderZero = (remainder == 0) ? true : false;
        System.out.println("Remainder = 0? " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
