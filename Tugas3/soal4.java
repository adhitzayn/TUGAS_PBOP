package pbo3;
import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        int penjualan;
        Scanner keyboard = new Scanner(System.in);
        penjualan = keyboard.nextInt();
        double bonus;
        final int gajiPokok = 500000;
        double totalGaji;
        int item = 50000;
        //int totalItem = (int) bonus *item;
        if(penjualan >= 40 && penjualan <= 80){
            bonus = (int) item*penjualan*0.25;
            totalGaji = (int) gajiPokok + bonus;
            System.out.println("Total gaji kamu : " + totalGaji);
        }
        else if(penjualan > 80){
            bonus = (int) item*penjualan*0.35;
            totalGaji=(double) gajiPokok + bonus;
            System.out.println("Total gaji kamu : " + totalGaji);
        }
        else if(penjualan < 40 && penjualan >= 15){
            bonus = (int) item*penjualan*0.1;
            totalGaji = (float) gajiPokok + bonus;
            System.out.println("Total gaji kamu : " + totalGaji);
        }
        else if (penjualan<15){
            double potongan = (int) (15 - penjualan)*0.15*item;
            totalGaji = (float) gajiPokok - potongan;
            System.out.println("Total gaji kamu : " + totalGaji);
        }
        
    }
    
}
