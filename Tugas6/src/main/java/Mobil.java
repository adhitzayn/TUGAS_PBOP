import java.util.List;

public class Mobil {
    private String plat;
    private int thn_pembuatan;
    private List<Kategori> Kategori;
    
    Mobil(String plat, int thn_pembuatan){
        this.plat = plat;
        this.thn_pembuatan = thn_pembuatan;
    }
    public String getMobilPlat(){
        return plat;
    }
    public int getThn(){
        return thn_pembuatan;
    }
    
    public List<Kategori> getKategori(){
        return Kategori;
    }
    
    //public void addKategori(){
      //  this.kategori.add(kategori);
    //}
}
