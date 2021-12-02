package Soal3;

import java.util.Scanner;
public class Pembagian {
    public static void pembagianNoExce (int pembilang, int penyebut){
         System.out.println(pembilang + "/" + penyebut + "=" + pembilang/penyebut);
    }
    
    public static void exception(int pembilang, int penyebut){
        try{
            System.out.println(pembilang + "/" + penyebut + "=" + pembilang/penyebut);
        }
        catch(Exception ex){
            System.out.println("Pembagian berhasil tak hingga jika penyebut = 0 !");
        }
    }
    
    public static void main(String[] args) {
        int pembilang, penyebut;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pembilang : ");
        pembilang = keyboard.nextInt();
        System.out.println("Penyebut : ");
        penyebut= keyboard.nextInt();
        //pembagianNoExce(pembilang, penyebut);
        exception(pembilang, penyebut);
    }
    
}
