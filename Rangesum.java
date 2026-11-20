import java.util.*;
public class Rangesum {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        b[i]=sc.nextInt();
        int sum =0;
        for(int j=a[i];j<=b[i];j++){
             sum = j+sum;
        }
        System.out.println(sum);
    }
  }  
}
