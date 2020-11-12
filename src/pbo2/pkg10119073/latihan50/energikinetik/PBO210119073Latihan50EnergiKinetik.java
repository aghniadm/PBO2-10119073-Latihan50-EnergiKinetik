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

public class PBO210119073Latihan50EnergiKinetik {

    public static void main(String[] args) {
        Bola bola = new Bola();

        bola.setMassa(0.145);
        bola.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 g dilempar dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah energi kinetiknya?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini");
        System.out.println("   jika dimulai dari keadaan diam?");
        System.out.println("");
        System.out.println("=====PENYELESAIAN=====");
        System.out.println("a. Energi kinetik = " + bola.hitungEnergiKinetik()+ " Joule");
        System.out.println("b. Usaha = " +bola.hitungUsaha()+ " Joule");
        System.out.println("");
        System.out.println("Jadi energi kinetik dan usahanya bernilai sebesar 45.3125 Joule");

    }
    
}
