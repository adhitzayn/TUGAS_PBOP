package pbo3;

import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner keyboard = new Scanner(System.in);
        
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        System.out.println(x + "+" + y);
        int penjumlahan = x+y;
        int pengurangan =  x - y;
        double pembagian = (double) x/y;
        int modulo = x%y;
        System.out.println("Penjumlahan : " +penjumlahan);
        System.out.println("Pengurangan : " +pengurangan);
        System.out.println("Pembagian : " +pembagian);
        System.out.println("Modulo : " + modulo);
    }
    
}
