package kasus1;

public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Makanan(String namaMakanan, double hargaMakanan, int stok){
        this.nama_makanan = namaMakanan;
        this.harga_makanan = hargaMakanan;
        this.stok = stok;
    }
    
    public String getNamaMakanan(){
        return nama_makanan;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void TampilMakanan(){
        System.out.println(nama_makanan + "[" + stok + "]" + "Rp. " + harga_makanan);
    }
    
    public void kurangStok(int jumlah){
        stok -= jumlah;
    }
}
