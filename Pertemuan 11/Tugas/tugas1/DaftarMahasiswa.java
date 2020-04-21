package tugas1;

/**
 *
 * @author FauzanOIOI
 */
public class DaftarMahasiswa {
    Mahasiswa head;
    int size;

    public DaftarMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nim, String nama, String alamat) {
        head = new Mahasiswa(nim, nama, alamat, head);
        size++;
    }

    public void add(int nim, String nama, String alamat, int index) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("Nilai Index di Luar Batas!");
        }
        if(isEmpty() || index == 0) {
            addFirst(nim, nama, alamat);
        } 
        else {
            Mahasiswa tmp = head;
            for(int i=1; i<index; i++) {
                tmp = tmp.next;
            }
            Mahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new Mahasiswa(nim, nama, alamat, next);
            size++;
        }
    }

    public void addLast(int nim, String nama, String alamat) {
        if(isEmpty()) {
            addFirst(nim, nama, alamat);
        } 
        else {
            Mahasiswa tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Mahasiswa(nim, nama, alamat, null);
            size++;
        }
    }

    public Object getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List KOSONG!");
        }
        return head.nim;
    }

    public Object getLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List KOSONG!");
        }
        Mahasiswa tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    public Object get(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas!");
        }
        Mahasiswa tmp = head;
        for(int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai Index di luar batas!");
        } 
        else if (isEmpty() || index == 0) {
            removeFirst();
        }
        else {
            Mahasiswa prev = head;
            Mahasiswa cur = head.next;
            for(int i=1; i<index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if(!isEmpty()) {
            Mahasiswa tmp = head;
            System.out.println("Data : ");
            System.out.println("=============================");
            while(tmp != null) {
                System.out.println("NIM\t: " + tmp.nim);
                System.out.println("Mama\t: " + tmp.nama);
                System.out.println("Alamat\t: " + tmp.alamat);
                System.out.println("=============================");
                tmp = tmp.next;
            }
        } 
        else {
            System.out.println("Linked List KOSONG!");
        }
    }

    public void addByValue(int cari, int nim, String nama, String alamat) throws Exception {
        Mahasiswa tmp = head;
        int index = 0;
        boolean ditemukan = false;
        while(tmp.next != null) {
            tmp = tmp.next;
            index++;
            if((int) head.nim == cari) {
                ditemukan = true;
                break;
            } 
            else if((int) tmp.nim == cari) {
                ditemukan = true;
                index++;
                break;
            }
        }
        if(ditemukan) {
            add(nim, nama, alamat, index);
        } 
        else {
            throw new Exception("Data tidak ditemukan!");
        }
    }

    public void removeByValue(int cari) throws Exception {
        Mahasiswa tmp = head;
        int index = 0;
        boolean ditemukan = false;
        while(tmp.next != null) {
            tmp = tmp.next;
            index++;
            if((int) head.nim == cari) {
                removeFirst();
                break;
            } 
            else if ((int) tmp.nim == cari) {
                ditemukan = true;
                break;
            }
        }
        if(ditemukan) {
            remove(index);
        } 
        else {
            throw new Exception("Data tidak ditemukan!");
        }
    }

    public void cari(int index) throws Exception {
        if(index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        }
        else {
            Mahasiswa tmp = head;
            for(int i=0; i<index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada indeks ke-" + index + " adalah : ");
            System.out.println("===============================");
            System.out.println("NIM\t: " + tmp.nim);
            System.out.println("Nama\t: " + tmp.nama);
            System.out.println("Alamat\t: " + tmp.alamat);
            System.out.println("===============================");
        }
    }

    public void cariKey(int cari) throws Exception {
        Mahasiswa tmp = head;
        int index = 0;
        boolean ditemukan = false;
        if(isEmpty()) {
            System.out.println("LinkedLists kosong");
        } 
        else {
            while(tmp.next != null) {
                tmp = tmp.next;
                if((int) head.nim == cari) {
                    ditemukan = true;
                    break;
                } 
                else if((int) tmp.nim == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
                index++;
            }
        }
        if(ditemukan) {
            System.out.println("NIM " + cari + " ditemukan pada indeks ke-" + index);
        } 
        else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
}
