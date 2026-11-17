// // import java.util.Scanner;
// // public class shape3{
// //     public static void main (String[] args){
// //         Scanner sc = new Scanner (System.in);
// //         int n = sc.nextInt();
// //         for (int i= 1; i<=n; i++){
// //             for (int j = 1; j<=n-i;j++){
// //                 System.out.print(" ");            }
// //                 for (int j=1 ;j<=(2*i)-1; j++){
// //                   System.out.print("*");  
// //                 }
// //                 System.out.println();
// //         }for (int i= n; i>=1; i--){
// //             for (int j = 1; j<=(n-i);j++){
// //                 System.out.print(" ");            }
// //                 for (int j=1 ;j<=(2*i)-1; j++){
// //                   System.out.print("*");  
// //                 }
// //                 System.out.println();
// //     }
// // }}
//  import java.util.Scanner;
// // // public class main{
// // // public static void main (String args[]){
// // // Scanner sc = new Scanner(System.in);
// // // int n =sc.nextInt();
// // // int a = 0, b= 1;
// // // for(int i=1;i<=n;i++){
// // // System.out.print(a+" ");
// // // int c = a+b;
// // // a=b;
// // // b=c;
// // // }
// // // }
// // // }
// // import java.util.Scanner;
// // public class main {
// // public static void main (String args []){
// // Scanner sc = new Scanner (System.in);
// // int k = sc.nextInt();
// // int s = sc.nextInt();
// // int count = 0;
// // for (int x = 0;x<=k;x++){
// // for(int y=0;y<=k;y++){
// // int z= s-x-y;
// // if(z>=0&&z<=k){
// // count++;
// // }
// // }
// // }
// // System.out.println(count);
// // }
// // }
// // import java.util.Scanner;
// // public class main {
// // public static void main (String []args){
// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // long sum = 0;
// // for (int i=0;i<n; i++){
// // long num= sc.nextLong();
// // sum=sum+num;
// // }
// // System.out.println(Math.abs(sum));
// // }}
// import java.util.Scanner;
// public class shape3 {
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for (int i=0;i<n;i++){
// arr[i] = sc.nextInt();
// }
// int x = sc.nextInt();
// int pos = -1;
// for (int i=0;i<n;i++){
// if(arr[i]==x){
// pos = i;
// break;
// }
// }
// System.out.println(pos);
// }
// }
// import java.util.*;
// public class shape3{
// public static void main(String []args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[]a=new int[n];
// for (int i=0;i<n;i++){
// a[i]=sc.nextInt();
// if(a[i]>0){
// a[i]=1;
// }
// else if(a[i]<0){
// a[i]=2;
// }
// }
// for(int i=0;i<n;i++){
// System.out.print(a[i]+"");
// }
// }
// }
// import java.util.*;
// public class shape3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int[]a=new int[n];
//         for(int i=0; i<n;i++){
//             a[i] = sc.nextInt();
//         }
//         for(int i=0;i<n; i++){
//             if(a[i]<=10){
//                 System.out.println("A["+i+"]"+ " = " + a[i]);
//             }
//         }

//     }
// }
// import java.util.Scanner;
// public class shape3{
//     public static void main(String args[]){
//         Scanner  sc = new Scanner (System.in);
//         int n= sc.nextInt();
//         int[]a = new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt(); 
//         }
//         int min =a[0];
//         int x = 1;
//         for(int i=1;i<n;i++){
//             if(a[i]<min){
//                min=a[i];
//                x=i+1; 
//             }
//         }
//         System.out.println(min+" "+x);

//     }
//}
// import java.util.*;
// public class shape3{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int []a=new int[n];
// for (int i=0;i<n;i++){
//     a[i]=sc.nextInt();
// }
// for(int j=n-1;j>=0;j--){
// System.out.print(a[j]+" ");
//     }}
// }
//palindrome array
// import java.util.*;
// public class shape3 {
// public static void main(String args []){
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();
//     int[]a=new int[n];

//     for(int i=0;i<n;i++){
//         a[i]=sc.nextInt();}
//         for(int i=0,j=n-1;i<j;i++,j--){
//         if( a[i]!=a[j]){
//             System.out.println("NO");
//         return ;
// }
//     }
//     System.out.println("YES");
//     }
// } 
// import java.util.*;
// public  class shape3 {
// public static void main (String args[]){
//     Scanner sc= new Scanner (System.in);
//     int n=sc.nextInt();
//     int[]a=new int[n];
//     int x =0;
//     for(int i=0;i<n;i++){
//         a[i]=sc.nextInt();
//      } for(int j=0;j<n;j++){
//         x+=a[j]; 
//      }if (x%2!=0) {
        
//      System.out.println("Unlucky" + x);
//             }
//         else{
//             System.out.println("Lucky");
//         }}
//             }
        
// import java.util.*;
// public  class shape3 {
// public static void main (String args[]){
//     Scanner sc= new Scanner (System.in);
//     int n=sc.nextInt();
//     int[]a=new int[n];
//     int x =0;
//     for(int i=0;i<n;i++){
//         a[i]=sc.nextInt();
//      for(int j=0;j<n;j++){
//         while (a[i]<a[j]) {
            
//         }
//      }
//      }}}half code
////contest#1
// import java.util.*;
// public class shape3{
// public static void main(String args[]){
//     Scanner sc = new Scanner (System.in);
//     int x =sc.nextInt();
//     int p =sc.nextInt();
//     double r = (p*100.0)/(100-x);
//     System.out.printf("%.2f",r);
// }
//  }
// import java.util.*;
// public class shape3 {

//     public static void main (String args[]){
//         Scanner sc= new Scanner(System.in);
//         long a = sc.nextLong();
//         long b = sc.nextLong();
//         long k = sc.nextLong();
//     if(a%k==0&& b%k==0){
//         System.out.println("Both");
//     }else if (a%k==0) {
//         System.out.println("Memo");
//     }else if (b%k==0){
//         System.out.println("Momo");
//     }else {
//         System.out.println("No One");
//     }
//     }
// }
// import java.util.*;
// public class shape3 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     char c = sc.next().charAt(0);
//     if(c=='z'){
//         System.out.println("a");
//     }else{
//         System.out.println((char)(c+1));
//     }

// }
    
// }
// import java.util.*;
// public class shape3 {

//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         long a=sc.nextLong();
//         long b=sc.nextLong();
//         long c=sc.nextLong();
//         long d=sc.nextLong();
//         if((a+b-c)==d){
//             System.out.println("YES");
//         }else if((a+b*c)==d){
//             System.out.println("YES");
//         }
//         else if ((a-b*c)==d){
//             System.out.println("YES");
//         }
//         else if((a-b+c)==d){
//             System.out.println("YES");
//         }
//         else if((a*b+c)==d){
//             System.out.println("YES");
//         }
//         else if ((a*b-c)==d){
//             System.out.println("YES");
//         }
//         else{
//             System.out.println("NO");
//         }
//     }
// }
// import  java.util.*;
// public class shape3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(Math.abs(a-b)<=1&&a+b>0){
//             System.out.println("YES");
//         }
//         else {
//             System.out.println("NO");
//         }
//     }
// }
// import java.util.*;
// public  class shape3 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = a^b;
//         System.out.println(c);
//     }
// }
// import java.util.*;
// public  class shape3 {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         long n = sc.nextLong();
//         long k = sc.nextLong();
//         long a = sc.nextLong();
//         if((n*k)%a !=0){
// System.out.println("double");
//         }else if((n*k)/a<=Integer.MAX_VALUE){
//             System.out.println("int");
//         }else{
//             System.out.println("long long");
//         }}}
// import java.util.*;
// public class shape3 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     int n=sc.nextInt();
//     int n1=n%10;
//     int n2 = n/10;

//      if(n1%n2==0 ||n2%n1==0){
//  System.out.println("YES");
//     }else{
//         System.out.println("NO");    }
// }
    
// }
import java.util.*;
public class shape3 {

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
    
