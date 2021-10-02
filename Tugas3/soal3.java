package pbo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class soal3 {
    public static void main(String[] args) {
        String[] operasi;
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            operasi = (input.readLine().split("\\s+"));
            if(Integer.parseInt(operasi[0]) >= 1 && Integer.parseInt(operasi[2]) <= 1000){
                switch(operasi[1]){
                    case "+" :
                        System.out.println(Integer.parseInt(operasi[0]) + Integer.parseInt(operasi[2]));
                        break;
                    case "-" :
                        System.out.println(Integer.parseInt(operasi[0]) - Integer.parseInt(operasi[2]));
                        break;
                    case "*" :
                        System.out.println(Integer.parseInt(operasi[0]) * Integer.parseInt(operasi[2]));
                        break;
                    case "/" :
                        System.out.println(Integer.parseInt(operasi[0]) / Integer.parseInt(operasi[2]));
                        break;
                    case "%" :
                        System.out.println(Integer.parseInt(operasi[0]) % Integer.parseInt(operasi[2]));
                        break;
                    default :
                        break;
                }
            }else{
                System.out.println("Angka tidak valid (1<= A,B <= 1000");
            }
        }
        catch (IOException e){
            System.out.println("error");
        }
    }
    
}
