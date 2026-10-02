package model;
public class Laptop extends Alat implements Terlacak {
    private int ramGB;
    private boolean chargerLengkap;

    public Laptop(String kode, String nama, int tahun,
            int ramGB, boolean chargerLengkap) {
        super(kode, nama, tahun);
        this.ramGB = ramGB;
        this.chargerLengkap = chargerLengkap;
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
        return "292999211";
    }
    @Override
    public String deskripsi() {
        return super.deskripsi() + " RAM " + ramGB;
    }

    @Override
    public boolean siapDipinjam() {
        return chargerLengkap;
    }
}

