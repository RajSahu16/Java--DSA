import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
       a[i]=sc.nextInt();}
       for(int j=0;j<n;j++){
       if(a[j]==t){
        System.out.println(j);
        break;
       }
        }
    }
}
