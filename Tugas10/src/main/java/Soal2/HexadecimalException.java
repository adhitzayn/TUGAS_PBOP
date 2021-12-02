package Soal2;

import java.util.*;

public class HexadecimalException {
    public static int IntHexadecimal(String hex){
        try{
            return Integer.parseInt(hex,16);
        }
        catch(Exception ex){
            System.out.println("There isn't hexadecimal !");
            return 0;
        }
    }
    public static String inputHex(){
        String hex=null;
        try (Scanner keyboard = new Scanner(System.in)){
            if(true){
                System.out.println("Input hexadecimal : ");
                hex = keyboard.next();
                int cek = IntHexadecimal(hex);
                System.out.println("result : " + cek);
            }
        }
        return "Exit";
    }
    
    public static void main(String[] args) {
        inputHex();
    }
}