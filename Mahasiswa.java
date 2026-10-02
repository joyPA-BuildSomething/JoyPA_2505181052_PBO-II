package model;
import java.io.Serializable;

/**
 *
 * @author indi
 */
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int KUOTA_PEMINJAMAN = 3;

    private final String nim;
    private final String nama;
    private final String programStudi;

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getProgramStudi() { return programStudi; }

    @Override public String toString() { return nim + " - " + nama; }
}