
import java.util.*;

public class HadyTrain  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long id = sc.nextLong();

        long row = id / 4;
        long pos = id % 4;

        long col;

        if (row % 2 == 0) {
            col = pos;
        } else {
            col = 3 - pos;
        }

        System.out.println(row + " " + col);
    }
}
