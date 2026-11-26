import java.util.*;
public class Strings {
    public static  void printLetter(String str){
        for(int i=0;i<str.length();i++){
           System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
    //     char arr[]={'a','b','c','d'};
    //     String str = "abcd";
    //     String str2=new String("xyz");
    //   Scanner sc = new Scanner (System.in);
    //   String name;
    //   name = sc.nextLine();
    //   System.out.println(name);
    // ////concatenation
      String Fullname = "Tony Stark";
      System.out.println(Fullname.length());
      String firstName= "Raj";
      String lastName ="Sahu";
      String fullname= firstName + " " + lastName;
    System.out.println(fullname.charAt(5));
    printLetter(fullname);
}
}