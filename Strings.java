// // import java.util.*;
// // public class Strings {
// //     public static  void printLetter(String str){
// //         for(int i=0;i<str.length();i++){
// //            System.out.println(str.charAt(i)+" ");
// //         }
// //         System.out.println();
// //     }
// //      public static void main(String[] args) {
// //     //     char arr[]={'a','b','c','d'};
// //     //     String str = "abcd";
// //     //     String str2=new String("xyz");
// //     //   Scanner sc = new Scanner (System.in);
// //     //   String name;
// //     //   name = sc.nextLine();
// //     //   System.out.println(name);
// //     // ////concatenation
// //       String Fullname = "Tony Stark";
// //       System.out.println(Fullname.length());
// //       String firstName= "Raj";
// //       String lastName ="Sahu";
// //       String fullname= firstName + " " + lastName;
// //     System.out.println(fullname.charAt(5));
// //     printLetter(fullname);
// // }
// // }
// ////////////Question Start
// import java.lang.classfile.constantpool.StringEntry;
// import java.util.*;
// public class Strings {
//     // question 1
//     public static boolean isPalindrome(String str){
//         for(int i=0;i<str.length();i++){
//             int n =str.length();
//             if(str.charAt(i)!=str.charAt(n-1-i)){
//               return false;
//             }
//         }
//         return true;
//     }
//     // Question 2
//     public static float getShortesPath(String path){
//         int x=0,y=0;
//         for(int i=0;i<path.length();i++){
//             char dir = path.charAt(i);
//             if(dir =='S'){
//                 y--;
//             }
//             else if (dir=='N'){
//                 y++;
//             }
//             else if(dir=='W'){
//                 x--;
//             }
//            else{
//                  x++;
//            }
//         }
//         int X2=x*x;
//         int Y2=y*y;
//         return (float)Math.sqrt(X2+Y2);
//     }

//     public static void main(String[] args) {
//         // String str = "racecar";
//         String path = "WNEENESENNN";
//         String s1 = "Tony";
//         String s2 = "Tony";
//          String s3 = new String("Tony");
//                    if(s1==s2){
//                     System.out.println("are equal");
//                    } 
//                    else{
//                     System.out.println("not equal");
//                    }   
//          if(s1==s3){
//                     System.out.println("are equal");
//                    } 
//                    else{
//                     System.out.println("not equal");
//                    }   
//                     if(s1.equals(s3)){
//                     System.out.println("are equal");
//                    } 
//                    else{
//                     System.out.println("not equal");
//                    }   
        
        
//     }
// }
import java.util.*;
public class Strings {
public static String subString(String str, int si,int ei){
    String substr ="";
    for(int i=0;i<ei;i++){
        substr +=str.charAt(i); 
    }
    return substr;
}
//////////Question 3
    public static void main(String[] args) {
        String str = "HelloWorld";
        String fruits[]={"apple","mango","banana"};
          String largest=fruits[0];
           for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
           }
           System.out.println(largest);
    //  Direct subString   //System.out.println(str.substring(0,5));
      // System.out.println(subString(str, 0, 5));
    }
}