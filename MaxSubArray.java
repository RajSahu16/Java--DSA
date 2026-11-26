
import java.util.*;

public class MaxSubArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {

                int max = arr[i];

                for (int j = i; j < n; j++) {

                    max = Math.max(max, arr[j]);

                    System.out.print(max + " ");
                }
            }

            System.out.println();
        }
    }
}
