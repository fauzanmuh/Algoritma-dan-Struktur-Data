package Tugas4;

/**
 *
 * @author FauzanOIOI
 */
public class CariPenduduk {
    public int jmlData;
    public Penduduk listPenduduk[];
    public int indeks;
    
    public CariPenduduk(int jumlah) {
        this.jmlData = jumlah;
        listPenduduk = new Penduduk[jumlah];
    }
    
    public void tambah(Penduduk P) {
        if (indeks<listPenduduk.length) {
            listPenduduk[indeks] = P;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jmlData; i++) {
            if (listPenduduk[i].nik == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("NIK : " + x + " ditemukan pada indeks " + pos);
            System.out.println("Data Penduduk ke-" + (pos + 1));
            System.out.println("NIK Penduduk\t: " + listPenduduk[pos].nik);
            System.out.println("Nama Penduduk\t: " + listPenduduk[pos].nama);
            System.out.println("Alamat Penduduk\t: " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin\t: " + listPenduduk[pos].jenisK);
            System.out.println("================================================");
        }
        else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
