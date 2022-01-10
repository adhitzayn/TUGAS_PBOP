public class OtomotifMobil {
        public static void main(String[] args) {

        Suplier hyundai = new Suplier("Hyundai", "Korea");
        
        Kategori mobilsantai = new Kategori(" Mobil Keluarga");
        
        Mobil tipe1 = new Mobil("08201B", 2019);
        
        
        //tipe1.addKategori(mobilsantai);
        
        Kendaraan darat = new Kendaraan("Ini kendaraan yang cocok dipakai buat "
                + "bepergian antar kota atau antar pulau dalam satu negara saja", 4);       
        
        System.out.println(hyundai.getNamaPerusahaan() + " Mengeluarkan" + mobilsantai.getKategoriNama() +
                    "\ndengan plat nomor " + tipe1.getMobilPlat() + "\ndengan dekripsi : " + darat.getKendaraanDeskripsi());
        
            System.out.println("INi apa : " + tipe1.getKategori());
            System.out.println("Ini juga kenapa gak muncul : " + hyundai.getListMobil());
    }
}
