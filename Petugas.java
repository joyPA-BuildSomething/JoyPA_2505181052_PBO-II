package model;
import java.io.Serializable;

/**
 *
 * @author indi
 */
public class Petugas implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String nip;
    private final String nama;

    public Petugas(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() { return nip; }
    public String getNama() { return nama; }

    @Override public String toString() { return nama; }
}