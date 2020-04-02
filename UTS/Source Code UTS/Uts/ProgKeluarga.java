package Uts;

/**
 *
 * @author FauzanOIOI
 */
public class ProgKeluarga {
    DataKeluarga listKeluarga[];
    int idx;

    ProgKeluarga() {

    }

    void ProgKeluarga(int array) {
        listKeluarga = new DataKeluarga[array];
    }

    void tambah(DataKeluarga t) {
        if (idx < listKeluarga.length) {
            listKeluarga[idx] = t;
            idx++;
        }
        else {
            System.out.println("Data sudah Penuh!");
        }
    }

    void tampil() {
        for (DataKeluarga t : listKeluarga) {
            System.out.println("=====================");
            t.tampil();
            System.out.println("=====================");
        }
    }

    void selectionSortAsc() {
        for (int i = 0; i < listKeluarga.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listKeluarga.length; j++) {
                if (listKeluarga[j].umur < listKeluarga[idxMin].umur) {
                    idxMin = j;
                }
            }
            DataKeluarga tmp = listKeluarga[idxMin];
            listKeluarga[idxMin] = listKeluarga[i];
            listKeluarga[i] = tmp;
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listKeluarga[mid].umur) {
                return (mid);
            }
            else if (listKeluarga[mid].umur > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Ada anggota keluarga yang berumur " + x + " tahun");
        } 
        else {
            System.out.println("Tidak ada anggota keluarga yang berumur " + x + " tahun");
        }
    }
}
