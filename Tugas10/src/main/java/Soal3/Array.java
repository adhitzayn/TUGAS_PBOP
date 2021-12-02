package Soal3;

/*public class Array {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[3] = 8;
    }
}*/

public class Array {
    public static void main(String[] args) {
        int a[] = new int[3];
        try {
            a[3] = 6;
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Indeks array melebihi batas !");
        }
    }
}
