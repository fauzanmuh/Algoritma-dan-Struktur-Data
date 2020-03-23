package Tugas3;

/**
 *
 * @author FauzanOIOI
 */
public class Searching {
    public int[] data;
    public int jumData;
    int terbesar = 0;

    public Searching(int[] Data, int jmlData) {
        this.jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }
    
    public void TampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public int FindBinarySearch(int cari, int data[], int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, data, left, mid - 1);
            } else {
                return FindBinarySearch(cari, data, mid + 1, right);
            }
        }
        return -1;
    }
    
    public int jumlahTerbesar(int cari, int data[]) {
        
        for (int i = 0; i < jumData; i++) {
            if (cari == data[i]) {
                terbesar++;
            }
        }
        return terbesar;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("Lokasi elemen terbesar berada pada indeks " + pos);
        }
        else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public int maks(int nilai[]) {
        int max = nilai[0];
        for (int i=0; i<10; i++) {
            if (nilai[i]>max) {
                max = nilai[i];
            }
        }
        return max;
    }
}
