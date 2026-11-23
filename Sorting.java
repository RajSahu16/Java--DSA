import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        int largest  = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            largest =Math.max( largest, a[i]);
            
        }
        int count []=new int[largest+1];
        for(int i=0;i<n;i++ ){
            count[a[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                a[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
