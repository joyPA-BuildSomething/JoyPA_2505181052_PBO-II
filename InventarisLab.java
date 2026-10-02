package layanan;

import model.AlatUkur;
import model.Kalibrasiable;
import model.Laptop;
import model.Alat;
import model.Proyektor;
import java.util.ArrayList;
import java.util.List;

public class InventarisLab{

    
    private final List<Alat> daftarAlat = new ArrayList<>();

    public void tambah(Alat alat) {
        daftarAlat.add(alat);
    }

    public List<Alat> semuaAlat() {
        return daftarAlat;
    }

    public void cetakStatusBercabang() {
        for (Alat a : daftarAlat) {
            if (a instanceof Laptop) {
                Laptop l = (Laptop) a;
                System.out.println(l.getNama() + " " + l.siapDipinjam());
            } else if (a instanceof Proyektor) {
                Proyektor p = (Proyektor) a;
                System.out.println(p.getNama() + " " + p.siapDipinjam());
            } else if (a instanceof AlatUkur) {
                AlatUkur u = (AlatUkur) a;
                System.out.println(u.getNama() + " " + u.siapDipinjam());
            }
        }
    }

    public void cetakStatus() {
        for (Alat a : daftarAlat) {
            System.out.println(a.laporanRingkas());
        }
    }

    public void cetakJadwalKalibrasi() {
        for (Alat a : daftarAlat) {
            if (a instanceof Kalibrasiable) {
                Kalibrasiable k = (Kalibrasiable) a;
                System.out.println(a.getNama() + " -> " + k.statusKalibrasi());
            }
        }
    }

    public int hitungSiapDipinjam() {
        int jumlahSiap = 0;
        for (Alat a : daftarAlat) {
            if (a.siapDipinjam()) {
                jumlahSiap++;
            }
        }
        return jumlahSiap;
    }

    public List<Alat> daftarTidakSiap() {
        List<Alat> jumlahBlmSiap = new ArrayList<>();
        for (Alat a : daftarAlat) {
            if (!a.siapDipinjam()) {
                jumlahBlmSiap.add(a);
            }
        }
        return jumlahBlmSiap;
    }
}
