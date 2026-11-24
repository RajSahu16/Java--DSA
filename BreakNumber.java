
import java.util.*;

public class BreakNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;

        for(int i = 0; i < n; i++) {

            long num = sc.nextLong();

            int count = 0;

            while(num % 2 == 0) {
                num = num / 2;
                count++;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
