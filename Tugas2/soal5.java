package pboP;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        String A, B;
        Scanner text = new Scanner(System.in);
        A = text.next();
        B = text.next();
        
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
         System.out.print(A.substring(0,1).toUpperCase()+A.substring(1, A.length()) + " ");
         System.out.print(B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
    }
    
}
