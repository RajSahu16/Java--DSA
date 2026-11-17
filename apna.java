// // //  import java.util.*;
// // //  public class apna {
// // //     public static void main(String[]args){
// // //         int marks []= new int [100];
// // //         Scanner sc = new Scanner(System.in);
// // //         marks[0]= sc.nextInt();
// // //         marks[1]= sc.nextInt();
// // //         marks[2]= sc.nextInt();
// // //          System.out.println("phy:" + marks[0]);
// // //          System.out.println("chem:" +marks [1]);
// // //          System.out.println("math:" +marks [2]);
// // //          int persentage = (marks[0]+marks[1]+marks[2])/3;
// // //          System.out.println("persentage =" + persentage +"%" );
         
// // //     }
// // // }
// // //  #while loop
// // // import java.util.*;
// // // //linear Search 
// // // public  class apna {
    
// // //     public static void main (String args[]){
// // //         Scanner sc =new Scanner(System.in);
// // //         int counter = sc.nextInt();
// // //         int i = 1;
// // //         int n = 0;
// // //         while (i<=counter){
// // //             n = n +i;
// // //             i++;
// // //         }System.out.println(n);
// // //     }}
// // // #for loop
// // // import java.util.*;
// // // public class apna {
// // //     public static void main (String args[]){
// // //         for ( int i=0;i<=10; i++){
// // //             System.out.print("hello world" + "   ");
// // //         }

// // //     }
// // // }
// // // import java.util.*;
// // // public class apna{
// // //     public static void main (String args []){
// // //         // for (int i=1; i<=4;i++)
// // //         int i =1;
// // //         while (i <= 10)
// // //         {
// // //             System.out.println("****");
// // //             i++;
// // //         }
// // //     }
// // // }
// // // import java.util.*;
// // // public class apna {
// // //     public static void main (String args[]){
// // //         Scanner sc = new Scanner (System .in);
// // //         int n = sc.nextInt();
// // //         while(n>0){
// // //             int LastDigit = n%10;
// // //             System.out.print(LastDigit);
// // //             n=n/10;

// // //         }
// // //         System.out.println();
// // //     }
// // // }
// // // import java.util.*;
// // // public class apna {
// // //     public static void main(String argd[]){
// // //         Scanner sc = new Scanner (System.in);
// // //         int n = 1;
// // //         do {
// // //             System.out.println("hello");
// // //             n++;
// // //         }while (n <=10);
// // //     }
// // // }
// // // import java.util.*;
// // // public class apna {
// // //     public static void main(String argd[]){
// // //         Scanner sc = new Scanner (System.in);
// // //         do{
// // //             int n = sc.nextInt();
// // //             if (n%10==0){
// // //                 break;
// // //             }System.out.println(n);
// // //         }
// // //         while (true);
// // //     }}
// import java.util.*; 
//  public class apna { 
//     public static void main (String []args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1; j<=n-i+1;j++){
//             System.out.print("*");
        
// }System.out.println();}
//     }
//  }
// // // import java.util.*; 
// // //   public class apna { 
// // //     public static void main (String []args){
// // //         Scanner sc = new Scanner(System.in);
// // //                  int n = sc.nextInt();
// // //                  char ch ='A';
// // //                  for (int i=1;i<=n; i++){
// // //                     for ( int j=1; j<=i;j++){
// // //                          System.out.print(ch);
// // //                           ch++;
// // //                     }System.out.println();}}
// // //                  }
// import java.util.Scanner;
// public class apna {
//     public static void printhelloworld(){
//         System.out.println("hello world");
//         return;
//     }
// public static void main (String args[]){
// printhelloworld();
// }
// }
// import java.util.*;
// public class shape3 {
// public static void factorial (int a){
//     int fact = 1;
//     for(int i=a;i>=1;i--){
        
//         fact = i*fact;

//     }
//     System.out.println(a+"!="+fact);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     factorial(a);
// }
    
// }
// import java.util.*;
// public class apna {
// public static int factorial (int n){
//     int fact = 1;
//     for(int i=1;i<=n;i++){
//          fact = i*fact;
//         }
//         return fact;
//     }
//  public static int Binomical(int n, int r){
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nr  = factorial(n-r);
//     int binomical = fact_n/(fact_r *fact_nr);
//     return binomical;}
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         System.out.println(Binomical(n, r));
//     }
// }
// import  java.util.*;
// public class apna {
// public static  void binToDec(int binNum){
//     int Mynum=binNum;
//     int pow = 0;
//     int decNum =0;
//     while (binNum>0) {
//         int lastDigit =binNum%10;
//         decNum =decNum +(lastDigit*(int)Math.pow(2,pow ));
//         pow++;
//         binNum=binNum/10;
//     }
//     System.out.println("decimal of" +  Mynum +" = "+ decNum);
// }public static void main(String[] args) {
//     binToDec(101);
// }
    
// }
// import java.util.*;
// public class apna {
// public static void DecToBIn(int dicNum) {
//    int mynum = dicNum;
//     int pow=0;
//   int bin =0;
//   while (dicNum>0) {
//      int rem = dicNum%2;
//     bin =bin +( rem * (int)Math.pow(10,pow));
// pow++;
// dicNum=dicNum/2;
    
//   }
// System.out.println("binary from of " + mynum +" = "+ bin);
// }
// public static void main(String[] args) {

//     DecToBIn( 7);
// }
    
// }
//////pattern start code
import java.util.*;
public class apna {
public static void pattern(int tolRow,int tolCol) {
    for(int i=1;i<=tolRow;i++){
        for(int j=1;j<=tolCol;j++){
            if(i==1 || i==tolRow ||j==1||j==tolCol){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
// Half pyramid 
public static void HalfPyramid(int n) {
    for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }}
    // Half pyramid number
    public static void HalfPyramidN(int n) {
        for(int i=1;i<=n;i++){
for(int j=1;j<=n-i+1;j++){
    System.out.print(j+" ");
}
     System.out.println();   }
        
    }
    // Floydstriangle 
    public static void Floydstriangle(int  n) {
  int counter =1;
        for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(counter +" ");
        counter++;
    }
    System.out.println();
  }      
    }
    // 0-1 triangle
    public static void  triangle01(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }System.out.println();
        }
    }
    // BUTTERFLY Pattern
    public static void Butterfly(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=n;i>=1;i--){
               for(int j=1 ;j<=i;j++){
                System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // SOLID RHOMBUS
    public static void solidrhombus(int n) {
     for(int i=1;i<=n;i++){
        for(int j=i;j<n;j++){
            System.out.print(" ");
        }for(int k=1;k<=n;k++){
            System.out.print("*");
        }
        System.out.println();
     }   
    }
    //HOLLOW RHOMBUS
    public static void hollowrhombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    // DIAMOND Pattern
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");}
                for(int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }System.out.println();
            }
        
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");}
                for(int k=1;k<=i+i-1;k++){
                    System.out.print("*");
        }System.out.println();}
    }
    
public static void main(String[] args) {
    diamond(10);
}}
// end pattern