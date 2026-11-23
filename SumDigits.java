import java.util.*;
public class SumDigits {
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    String s =sc.next();
    int sum =0;
    for(int i=0;i<n;i++){
        a[i]=s.charAt(i)-'0';
        sum=a[i]+sum;
    }
    System.out.println(sum);
  }  
}
