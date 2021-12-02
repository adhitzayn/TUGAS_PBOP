package Soal3;

import java.io.*;

/*public class OperasiFile {
    public static void main(String[] args) {
        File file = new File("C://Users//Hp//Documents//nyobain.txt");
        FileReader fr = new FileReader(file);
    }   
}*/

public class OperasiFile {
    public static void main(String[] args) {
        try{
        File file = new File("C://Users//Hp//Documents//nyobain.txt");
        FileReader fr = new FileReader(file);
        }
        catch (Exception ex){
            System.out.println("File tidak ditemukan !");
        }
    }
}
