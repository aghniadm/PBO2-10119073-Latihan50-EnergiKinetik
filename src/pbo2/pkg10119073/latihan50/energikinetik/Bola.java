package pbo2.pkg10119073.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung energi kinetik
 *
 */

public class Bola {
    private int kecepatan;
    private double massa;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * massa * (kecepatan * kecepatan);
    }
   
    public double hitungUsaha() {
        return 0.5 * massa * (kecepatan * kecepatan) - 0.5 * massa * (0 * 0);
    }
}
