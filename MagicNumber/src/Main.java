import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            String[] parts = line.split(" ");
            int low = Integer.parseInt(parts[0]);
            int high = Integer.parseInt(parts[1]);
            int magic = 0;
            System.out.println(low);
            System.out.println(high);
            for(int i=low; i<=high; i++){
                int count = 0;
                int down = i;
                int digitcheck = i;
                while (i>0) {
                    down /=  10;
                    count++;
                }
                int[] digits = new int[count];
                for(int j=1; j<=count; j++) {
                    digits[count - j] = digitcheck % 10;
                    digitcheck /= 10;
                }
                boolean notMagic = false;
                for(int k=0; k<count; k++) {
                    for(int m=k+1; m<count; m++) {
                        if (digits[k] == digits[m])
                            notMagic = true;
                    }
                }
                if (notMagic)
                    continue;
                int step = 0;
                int next = 1;
                for(int n=0; n<count; n++) {
                    if (next == 0) {
                        notMagic = true;
                        break;
                    }
                    next = digits[step];
                    digits[step] = 0;
                    step += next;
                    while (step >= count) {
                        step -= count;
                    }
                }
                if (!notMagic) {
                    System.out.println(i);
                    magic++;
                }
            }
            if (magic == 0) {
                System.out.println(-1);
            }
        }
    }
}