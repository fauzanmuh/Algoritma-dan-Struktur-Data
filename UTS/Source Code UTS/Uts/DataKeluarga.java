package Uts;

/**
 *
 * @author FauzanOIOI
 */
public class DataKeluarga {
    String nama, posisi;
    int umur;

    DataKeluarga(String nm, String pos, int u) {
        nama = nm;
        posisi = pos;
        umur = u;
    }

    void tampil() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Posisi\t: " + posisi);
        System.out.println("Umur\t: " + umur);
    }
}
