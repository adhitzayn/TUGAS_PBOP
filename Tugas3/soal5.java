package pbo3;

import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String plat1 = keyboard.next();
        String plat2 = keyboard.next();
        String plat3 = keyboard.next();
        String plat4 = keyboard.next();
        
        String gabunganPlat = String.valueOf(plat1 + plat2 + plat3 + plat4);
        long number = Long.parseLong(gabunganPlat);
        //System.out.println("Ini number perselong : " +number);
        long putusan = number - 999999;
        byte modulo = (byte) (putusan % 5);
        //System.out.println("ini putusan : " + putusan);
        //System.out.println("ini modulo : " + modulo);
        if(modulo == 0){
            System.out.println("berhenti");
        }
        else if(modulo != 0){
            System.out.println("jalan");
        }
    }
    
}
