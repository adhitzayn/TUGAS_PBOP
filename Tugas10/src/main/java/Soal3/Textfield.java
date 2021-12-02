package Soal3;

import java.util.Scanner;
import java.util.InputMismatchException;
/*public class Textfield {
    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Masukan berat badan anda (dalam cm) : ");
        keyboard.nextInt();
    } 
}*/

public class Textfield {
    public static void main(String[] args) {
        try{
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Masukan berat badan anda (dalam cm) : ");
        keyboard.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println("Nilai tidak valid !");
        }
    } 
}