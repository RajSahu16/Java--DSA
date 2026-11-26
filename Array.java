// import java.util.*;
// public class Array {
//   public static void main(String[] args) {
//     int marks[]=new int[50];
//     Scanner sc = new Scanner (System.in);
//      marks [0]=sc.nextInt();
//      marks[1]=sc.nextInt();
//      marks[2]=sc.nextInt();

//      System.out.println("phy = " + marks[0]);
//      System.out.println("chem = " + marks[1]);
//      System.out.println("math = " + marks[2]);
//      int percentage =((marks[0]+marks[1]+marks[2])/3);
//      System.out.println(percentage+"%");
//   }  
// }
// largest number 
// import  java.util.*;
// public class Array {
// public static int getlargest(int numbers[]) {
//     int largest = Integer.MIN_VALUE;
//     int smallest = Integer.MAX_VALUE;
//     for(int i=0; i<numbers.length; i++){
//         if(largest<numbers[i]){
//             largest =numbers[i];
//         }if (smallest>numbers[i]){
// smallest = numbers[i];
//         }
//     }
//     System.out.println("smallest value is = " + smallest );
//     return largest;
// }
// public static void main(String[] args) {
//     int numbers[] ={1,2,36,9,5,8};
//     System.out.println("largest value is =" + getlargest(numbers));
// }
// }
////binary search
// import java.util.*;
// public class Array {

//     public static int binarySearch(int numbers[],int key) {
//         int start =0 , end  = numbers.length-1;
//         while (start<= end) {
//             int mid =(start+end)/2;
//             if (numbers[mid]==key){
//                 return mid;
//             }if(numbers[mid]<key){
//                 start =mid+1;
//             }else{
//                 end = mid-1;
//             }        }
//             return -1;
        
//     }
//     public static void main(String[] args) {
//         int numbers []={2,4,6,8,10,12,14};
//         Scanner sc =new Scanner (System.in);
//         int key = sc.nextInt();
//         System.out.println("index for key is=" + binarySearch(numbers, key));
//         System.out.println(numbers.length);
//     }
// //}
// // // Reverse an array 
// import java.util.*;
// public  class Array {

//     public static void Reverse(int numbers []) {
//         int first =0;
//         int last = numbers.length -1;
//         while (first < last) {
//             int temp = numbers[last];
//             numbers [last] =numbers[first];
//             numbers [first]=temp;
//             first++;
//             last--;
            
//         }
        
//     }
//     public static void main(String[] args) {
//         int numbers [] ={2,4,6,8,10};
//         Reverse(numbers);
//         for(int i=0;i<numbers.length;i++){
//             System.out.println(numbers[i]+" ");
//         }
//         System.out.println();
//     }
// }
////// pair in an Array
// import java.util.*;
// public  class Array {

//     public static void pair(int numbers[]) {
//         for(int i=0; i<numbers.length;i++){
//             int curr = numbers[i];
//             for(int j=i+1;j<numbers.length;j++ ){
//                 System.out.print("(" + curr +","+ numbers[j] + ")" );
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         int numbers []= {1,2,3,4,5,6};
//         pair(numbers);
//     }
// }
//////Print Subarray
// import java.util.*;
// public class Array {
//     public static void Subarray(int numbers[]){
//     int sum =0;
//     int maxsum =Integer.MIN_VALUE;

//         for(int i=0;i<numbers.length;i++){
//         for (int j=i;j<numbers.length;j++){
//             sum = 0;
//             for(int k=i;k<=j;k++){
//               //  System.out.print(numbers[k]+" ");
//                  sum = numbers[k]+sum;
//             }
//             System.out.println(sum);
//             if(maxsum<sum){
//                 maxsum=sum;
//             }
//         }
    
//         }
//         System.out.println("max sum = " + maxsum);
//     }

//     public static void main(String[] args) {
//        int numbers[] ={2,-5,5000,1000,-6,-9,10};
//        Subarray(numbers); 
//     }
//}
// maxsubarray
// import java.util.*;
// public class Array {
//     public static void Subarray(int numbers[]){
//     int sum =0;
//     int maxsum =Integer.MIN_VALUE;
//     int prefix [] = new int[numbers.length];
//         prefix[0] = numbers[0];
//         for(int i=0;i<prefix.length;i++)
//             {
//             prefix[i]=prefix[i-1] + numbers[i];
//         }
//             for(int i=1;i<numbers.length;i++){
//                 int start = i;
//         for (int j=i;j<numbers.length;j++){
//             int end = j;

//             sum = start ==0 ? prefix[end] : prefix[end]- prefix[start-1];
            
//             if(maxsum<sum){
//                 maxsum=sum;
//             }
//         }
    
//         }
//       System.out.println("max sum = " + maxsum);  
    
//     }
//     public static void main(String[] args) {
//        int numbers[] ={1,-2,6,-1,3};
//        Subarray(numbers); 
//     }
// }
// import java.util.*;
// public class Array {
//     public static void kadanes(int numbers[]){
//      int ms = Integer.MIN_VALUE;
//      int cs =0;
//      for(int i=0; i<numbers.length;i++){
//         cs = cs+numbers[i];
//         if(cs<0){
//             cs=0;
//         }
//         ms=Math.max(cs, ms);
//      }
//      System.out.println("our max subarray sum is =" + ms);
//     }

//     public static void main(String[] args) {
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//     kadanes(numbers);
//     }
// }
// Trapping Rainwater
// import java.util.*;
// public class Array {
//     public static int trappedRainWater(int height[]) {
//         int n = height.length;
//         int leftMax []= new int[n];
//         leftMax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftMax [i]=Math.max(height[i], leftMax[i-1]);
//         }
//         int rightMax[]= new int[height.length];
//         rightMax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//         rightMax[i]= Math.max(height[i], rightMax[i+1]);
//         }
//         int trappedWater =0;
//         for(int i=0;i<n;i++){
//            int waterlevel=Math.min(leftMax[i], rightMax[i]);
        
//           trappedWater += waterlevel -height[i];}
//    return  trappedWater;
//         }
//     public static void main(String[]args){
//     int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
//     System.out.println(trappedRainWater(height));
//     }
// }
// import java.util.*;
// import java.util.Collection;
// public class Array {
//     public static void insertionsort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int curr=arr[i];
//             int prev=i-1;
//             while (prev>=0&&arr[prev]>curr) {
//                 arr[prev+1]=arr[prev];
//                 prev--;
//             }
//             arr[prev+1]=curr;
//         }
//     }
//     public static void main(String[] args) {
//       int arr[]={5,4,1,3,2};
//       insertionsort(arr);
//       System.out.println(Arrays.toString(arr));
      
//     }
// }
// import java .util.*;
// public class Array {
// public static void countingsort( int arr[]){
//     int largest = Integer.MIN_VALUE;
//     for(int i=0; i<arr.length;i++){
//         largest = Math.max(largest,arr[i]);
//     }
//     int count[]=new int[largest+1];
//     for(int i=0;i<arr.length;i++ ){
//         count [arr[i]]++;
//     }int j=0;
//     for(int i=0;i<count.length;i++){
//         while(count[i]>0){
//             arr[i]=i;
//             j++;
//             count[i]--;
//         }
//     }
// }
// public static void main(String[] args) {
//     int arr[]={5,4,1,3,2};
//    countingsort(arr);
// System.out.println(arr);
// }
// }
///////// 2D Array
// import  java.util.*;
// public class Array {
//     public static boolean search (int matrix[][],int key ) {
//                 for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix [i][j]==key){
//                     System.out.println("found at cell ("+ i + ","+ j + ")");
//                     return true;
//                 }
//     }}
//     System.out.println("key not found ");
//     return false;
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int matrix [][]= new int [3][3];
//         int n=3, m=3;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//               matrix[i][j]=sc.nextInt();  
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j] + " ");
            
//             }
//             System.out.println();
//         }
//         search(matrix, 11);
//     }
// }
///////Spiral Mathrix///////
import java.util.*;
public class Array {
public static void printSpiral(int matix[][]) {
    int startRow=0;
    int startCol=0;
    int endRow=matix.length-1;
    int endCol=matix[0].length-1;
    while ( startRow<=endRow && startCol<=endCol ) {
        for(int j=startCol;j<=endCol;j++){
            System.out.print(matix[startRow][j]+" ");
        }
        // right
        for(int i=startRow+1;i<endRow;i++){
    System.out.print(matix[i][endCol]+" ");
        }
        // bottom
        for(int j=endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matix[endRow][j]+" ");
            
        }
        //left
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol==endCol){
                break;
            }
            System.out.print(matix[i][startCol]+" ");
        }
      startCol++;
      startRow++;
      endCol--;
      endRow--;  
    }
    System.out.println();
}
public static int diagonalsum(int matrix[][]){
    int sum=0;
    // high time comlexity hai
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if (i==j) {
//                 sum+=matrix[i][j];
                
//             }
//             else if(i+j==matrix.length-1){
//                 sum+=matrix[i][j];
//             } 
//         }
// }   low time complexity hai 
for(int i=0; i<matrix.length;i++){
    sum+=matrix[i][i];
    if(i!=matrix.length-1-i){
    sum+=matrix[i][matrix.length-1-i];}
}
 return sum   ;    
}
public static boolean staircaseSearch (int matrix[][],int key) {
    int row = 0, col =matrix[0].length-1;
    while ((row<matrix.length && col>=0)) {
        if(matrix[row][col]==key){
            System.out.println("found key at ("+row+","+col+")");
            return true;
        }
        else if (key < matrix[row][col]){
            System.out.println(matrix[row][col]);
           col--; 
        }
        else{
            System.out.println(matrix[row][col]);
            row++;
        }
    }
    System.out.println("key not found!");
    return  false;
}
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        // printSpiral(matrix);
        int key =27;
        staircaseSearch(matrix, key);
     //  System.out.println( diagonalsum(matrix));
    }
}
