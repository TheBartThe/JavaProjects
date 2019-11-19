package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
//        while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {       //infinite loop - statement inside tested to break loop
//            if(count == 5){
//                break;
//            }
//            System.out.println("Count value = " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number ++;
            if (!isEvenNumber(number)) {
                continue;   //if false - no effect, if true - return to start of loop
            }
            evenNumbersFound++;
            System.out.println("Even number " + number);
            if(evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Number of even numbers = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        return((number % 2) == 0);
    }
}
