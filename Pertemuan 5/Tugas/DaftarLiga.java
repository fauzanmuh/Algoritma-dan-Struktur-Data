package Tugas;

/**
 *
 * @author FauzanOIOI
 */
public class DaftarLiga {
    LigaInggris listLiga[] = new LigaInggris[20];
    int idx;
    
    void tambah(LigaInggris L) {
        if(idx<listLiga.length) {
            listLiga[idx] = L;
            idx++;
        } 
        else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil() {
        for(LigaInggris L : listLiga) {
            L.tampil();
        }
    }
    
    void insertionSortA() {
        int i, j;
        for(i = 1; i < listLiga.length; i++) {
            LigaInggris temp = listLiga[i];
            j=i;
            while((j > 0) && (listLiga[j-1].poin > temp.poin)) {
                listLiga[j] = listLiga[j - 1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
    
    void insertionSortD() {
        int i, j;
        for(i = 1; i < listLiga.length; i++) {
            LigaInggris temp = listLiga[i];
            j=i;
            while((j > 0) && (listLiga[j-1].poin < temp.poin)) {
                listLiga[j] = listLiga[j - 1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
}
