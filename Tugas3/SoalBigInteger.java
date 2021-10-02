package pbo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class SoalBigInteger {
    public static void main(String[] args) {
        BigInteger[] nilai = new BigInteger[2];
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            for(int i=0; i<2; i++){
                nilai[i] = BigInteger.valueOf(Long.parseLong(input.readLine()));
            }
            System.out.println(nilai[0].add(nilai[1]));
            System.out.println(nilai[0].multiply(nilai[1]));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}