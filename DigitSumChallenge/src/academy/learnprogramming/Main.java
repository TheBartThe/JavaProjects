package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(232));
        System.out.println(sumDigits(62));
        System.out.println(sumDigits(4123));
        System.out.println(sumDigits(7536));
        System.out.println(sumDigits(6));
        System.out.println(sumDigits(-24));
    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
//        int sum = 0;
////        while(number != 0) {
////            sum += (number % 10);
////            number /= 10;
////        }
////        return sum;
        int sum = 0;
        for(int i = number; i != 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}
