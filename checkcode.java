
import java.util.*;

public class checkcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        String S = sc.next();

        if (S.length() == A + B + 1 && S.charAt(A) == '-') {
            boolean valid = true;

            for (int i = 0; i < S.length(); i++) {
                if (i != A && !Character.isDigit(S.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
