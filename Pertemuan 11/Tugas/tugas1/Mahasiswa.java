package tugas1;

/**
 *
 * @author FauzanOIOI
 */
public class Mahasiswa<T> {
    T nim, nama, alamat;
    Mahasiswa<T> next;

    public Mahasiswa(T nim, T nama, T alamat, Mahasiswa<T> next) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.next = next;
    }
}
