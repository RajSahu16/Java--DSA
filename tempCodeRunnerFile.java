import java.util.*;
public class Drawingx {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x =n/2;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==x && j==x){
                    System.out.print("X");
                }else if(i==j){
                    System.out.print("\\");
                }
                else if(i+j==n-1){
                    System.out.print("/");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}