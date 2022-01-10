public class Kendaraan {
    private String deskripsi;
    private int roda;
    
    Kendaraan(String deskripsi, int roda){
        this.deskripsi = deskripsi;
        this.roda = roda;
    }
    
    public String getKendaraanDeskripsi(){
        return deskripsi;
    }
    
    public int getKendaraanRoda(){
        return roda;
    }
}
