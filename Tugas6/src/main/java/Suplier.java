import java.util.List;

import java.util.List;

public class Suplier {
    private String nama_perusahaan;
    private String alamat;
    private List<Mobil> mobil;
    
    Suplier(String nama_perusahaan, String alamat){
        this.nama_perusahaan = nama_perusahaan;
        this.alamat = alamat;
    }
    
    public String getNamaPerusahaan(){
        return nama_perusahaan;
    }
    
    public String alamat(){
        return alamat;
    }
    
    public void showProduk(Mobil car){
        mobil.add(car);
    }
    
    public List<Mobil> getListMobil(){
        return mobil;
    }
}
