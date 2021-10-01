package pbo3;

import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            String s1=keyboard.next();
            int x=keyboard.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
    }
    
}
