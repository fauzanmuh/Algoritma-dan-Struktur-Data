package tugas2;

/**
 *
 * @author FauzanOIOI
 */
public class DftrBaju {
    Baju head;
    int size;

    public DftrBaju() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int noBaju, String namaBaju, int berat, int jumlah) {
        head = new Baju(noBaju, namaBaju, berat, jumlah, head);
        size++;
    }

    public void getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Mesin Cuci Masih Kosong!");
        }
        System.out.println("========Baju DiKeluarkan========");
        System.out.println("No. Baju\t: " +head.noBaju);
        System.out.println("Nama Baju\t: " +head.namaBaju);
        System.out.println("Berat\t\t: " +head.berat);
        System.out.println("Jumlah\t\t: " +head.jumlah);
        System.out.println("=============================");
    }

    public void getLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Tas Masih Kosong!");
        }
        Baju tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.println("========Baju DiKeluarkan========");
        System.out.println("No. Barang\t: " + tmp.noBaju);
        System.out.println("Nama Barang\t: " +tmp.namaBaju);
        System.out.println("Berat\t\t: " +tmp.berat);
        System.out.println("Jumlah\t\t: " +tmp.jumlah);
        System.out.println("=============================");
    }

    public void removeFirst() throws Exception {
        System.out.println("========Baju DiKeluarkan========");
        System.out.println("No. Baju\t: " +head.noBaju);
        System.out.println("Nama Baju\t: " +head.namaBaju);
        System.out.println("Berat\t\t: " +head.berat);
        System.out.println("Jumlah\t\t: " +head.jumlah);
        System.out.println("=============================");
        head = head.next;
        size--;
    }

    public void clear() {
        System.out.println("Semua Baju Dikeluarkan!");
        head = null;
        size = 0;
    }

    public void print() {
        if(!isEmpty()) {
            Baju tmp = head;
            System.out.println("Tumpukan dari teratas ke terbawah : ");
            System.out.println("=============================");
            while(tmp != null) {
                System.out.println("No. Baju\t: " +tmp.noBaju);
                System.out.println("Nama Baju\t: " +tmp.namaBaju);
                System.out.println("Berat\t\t: " +tmp.berat);
                System.out.println("Jumlah\t\t: " +tmp.jumlah);
                System.out.println("=============================");
                tmp = tmp.next;
            }
        } 
        else {
            System.out.println("Linked List KOSONG!");
        }
    }

    public void cari(int index) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("Nilai tumpukan diluar batas");
        } 
        else {
            Baju tmp = head;
            for(int i=0; i<index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Baju pada tumpukan ke-" +index+ " adalah : ");
            System.out.println("===============================");
            System.out.println("No. Baju\t: " +tmp.noBaju);
            System.out.println("Nama Baju\t: " +tmp.namaBaju);
            System.out.println("Berat\t\t: " +tmp.berat);
            System.out.println("Jumlah\t\t: " +tmp.jumlah);
            System.out.println("===============================");
        }
    }

    public void cariKey(int cari) throws Exception {
        Baju tmp = head;
        int index = 0;
        boolean ditemukan = false;
        if(isEmpty()) {
            System.out.println("Mesin Cuci Masih Kosong!");
        } 
        else {
            while(tmp.next != null) {
                tmp = tmp.next;
                if((int) head.noBaju == cari) {
                    ditemukan = true;
                    break;
                } 
                else if((int) tmp.noBaju == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
                index++;
            }
        }
        if(ditemukan) {
            System.out.println("Nomor baju " +cari+ " ditemukan pada tumpukan ke-" + index);
        } 
        else {
            throw new Exception("Nomor baju tidak ditemukan!");
        }
    }

    public void hitungBerat() {
        if(!isEmpty()) {
            Baju tmp = head;
            int total = 0;
            System.out.println("Barang : ");
            System.out.println("=============================");
            while(tmp != null) {
                total += tmp.beratBaju;
                System.out.println("Nama Baju\t: " +tmp.namaBaju);
                System.out.println("Berat\t\t: " +tmp.berat);
                System.out.println("Jumlah\t\t: " +tmp.jumlah);
                System.out.println("Total Berat\t: " +tmp.beratBaju);
                System.out.println("=============================");
                tmp = tmp.next;
            }
            System.out.println("Total Berat keseluruhan " +total+ " gram");
        } 
        else {
            System.out.println("Mesin Cuci Masih Kosong!");
        }
    }
}