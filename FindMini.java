import java.util.*;
public class FindMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[]= new int[n];
       for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int y =1;
        int sum=n%k;
        for(int t=0;t<n/k;t++){
        for(int j=y;j<k;j++){
            min = Math.min(min, a[j]) ;
 }
 System.out.print(min +" " );
 min =0;
    y=y+k;}
System.out.println(sum);
    }
}
