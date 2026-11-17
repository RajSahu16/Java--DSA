import java.util.*;
public class TimandPum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if((a-b)>=0){
            System.out.println(a-b);
        }else{
            System.out.println("0");
        }
    }
}
