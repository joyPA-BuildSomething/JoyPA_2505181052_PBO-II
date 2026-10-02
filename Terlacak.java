package model;
public interface Terlacak {
    String nomorSeri();
    String lokasiTerakhir();
    
    default String ringkasanLacak(){
        return "Nomor seri :" + nomorSeri() + ". Lokasi Terakhir : " + lokasiTerakhir();
        
    }

}
