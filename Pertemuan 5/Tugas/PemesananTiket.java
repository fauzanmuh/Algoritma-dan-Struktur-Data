package Tugas;


/**
 *
 * @author FauzanOIOI
 */
public class PemesananTiket {
    Tiket listTiket[] = new Tiket[5];
    int tik;
    
    void tambah(Tiket t) {
        if(tik<listTiket.length) {
            listTiket[tik] = t;
            tik++;
        }
        else {
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampil() {
        for(Tiket t : listTiket) {
            t.tampil();
            System.out.println("--------------------------");
        }
    }
    
    public void bubbleSort(){
        for(int i=0; i<listTiket.length-1; i++){
            for(int j=1; j<listTiket.length-i; j++){
                if(listTiket[j].harga > listTiket[j-1].harga){
                    // di bawah ini proses swap atau penukaran
                    Tiket tmp = listTiket[j];
                    listTiket[j] = listTiket[j-1];
                    listTiket[j-1] = tmp;
                }
            }
        }
    }
    
    public void selectionSort(){
        for(int i=0; i<listTiket.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listTiket.length; j++){
                if(listTiket[j].harga < listTiket[idxMin].harga){
                    idxMin = j;
                }
            }
            // swap
            Tiket tmp = listTiket[idxMin];
            listTiket[idxMin] = listTiket[i];
            listTiket[i] = tmp;
        }
    }
}