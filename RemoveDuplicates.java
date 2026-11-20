import java.util.*;
public class RemoveDuplicates {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.print(a[0] +" ");
    for(int j=1;j<n;j++){
        if(a[j]!=a[j-1]){
            System.out.print(a[j]+" ");
        }
    }

   } 
}
