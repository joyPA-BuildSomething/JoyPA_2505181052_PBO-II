package model;
public class Proyektor extends Alat implements Terlacak{
    private int lumen;
    private int jamPakaiLampu;

    public Proyektor(String kode, String nama, int tahun,
            int lumen, int jamPakaiLampu) {
        super(kode, nama, tahun);
        this.lumen = lumen;
        this.jamPakaiLampu = jamPakaiLampu;
    }


    @Override
    public String lokasiTerakhir(){
        if(siapDipinjam() == true){
            return " Di lap RPL";
        } else{
            return "Dipinjam luar kampus";
        }
    }

    @Override
    public String nomorSeri(){
        return "29292929";
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " "+ lumen + " lumen ";
    }

    @Override
    public boolean siapDipinjam() {
        if(jamPakaiLampu < 2000){
            return true;
        } else{
            return false;
        }
    }

   
}
