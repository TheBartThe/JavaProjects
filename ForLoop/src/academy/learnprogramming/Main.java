package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for(int i = 6; i <= 50; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate / 100));
    }

    public static boolean isPrime(int n) {

        if(n==1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
