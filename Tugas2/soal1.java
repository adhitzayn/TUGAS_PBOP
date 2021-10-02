
package pboP;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
      
        for(int i=0; i<a; i++)
        {
         try
         {
             long inputValue = value.nextLong();
             System.out.println(inputValue + " can be fitted in : ");
             if(inputValue>=-128 && inputValue<=127)
             {
                 System.out.println("* byte");
             }
             if(inputValue>=Short.MIN_VALUE && inputValue<=Short.MAX_VALUE)
             {
                 System.out.println("* short");
             }
             if(inputValue>=Integer.MIN_VALUE && inputValue<=Integer.MAX_VALUE)
             {
                 System.out.println("* int");
             }
             if(inputValue>= Long.MIN_VALUE && inputValue<=Long.MAX_VALUE)
             {
                 System.out.println("* long");
             }
         }
         catch(Exception e)
                     {
                     System.out.println(value.next()+ " can't be fitted anywhere.");
                     }
        }
    }
    
}
