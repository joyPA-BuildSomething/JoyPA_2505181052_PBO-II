package model;

import java.time.LocalDate;
/* Dari AI */
public class AlatUkur extends Alat implements Kalibrasiable {
    private String satuan;
    private LocalDate kalibrasiTerakhir;

    public AlatUkur(String kodeAlat, String nama, int tahunPerolehan,
            String satuan, LocalDate kalibrasiTerakhir) {
        super(kodeAlat, nama, tahunPerolehan);
        this.satuan = satuan;
        this.kalibrasiTerakhir = kalibrasiTerakhir;
    }

   
    public LocalDate jatuhTempoKalibrasi(){
        return kalibrasiTerakhir.plusMonths(12);
    }

  
    public boolean perluKalibrasi(){
        return LocalDate.now().isAfter(jatuhTempoKalibrasi());
    }

    @Override
    public boolean siapDipinjam() {
        return !perluKalibrasi();
    }

    /* Buatan sebelumnya */
    @Override 
    public String deskripsi() {
        return super.deskripsi() + " " + satuan + " satuan ";
    }
}