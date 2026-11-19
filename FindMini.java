import java.util.*;

public class FindMini {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = (n + k - 1) / k;
        int y = 0;

        for (int t = 0; t < sum; t++) {

            int min = Integer.MAX_VALUE;

            for (int j = y; j < Math.min(y + k, n); j++) {
                min = Math.min(min, a[j]);
            }

            System.out.print(min + " ");

            y = y + k;
        }
    }
}
