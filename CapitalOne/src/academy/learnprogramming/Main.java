package academy.learnprogramming;
import java.util.Scanner;
public class Main {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        long[] arr = new long[size];
        for(int i=0; i < size; i++) {
            arr[i] = scanner.nextLong();
            scanner.nextLine();
        }
        scanner.close();
        for(int i=0; i < arr.length; i++) {
            long number = arr[i];
            int count = 1;
            int A = 0;
            int B = 0;
            long var = 0;
            for(int j=1; j <= 16; j++) {
                var = number % 10;
                number /= 10;
                if(count % 2 == 0) {
                    var *= 2;
                    if(var >= 10) {
                        var -= 9;
                    }
                    A += var;
                } else {
                    B += var;
                }
                count++;
            }
            if((A + B) % 10 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}