package Tugas1;

/**
 *
 * @author FauzanOIOI
 */
public class Modifikasi {
    int size, top;
    String data[];

    public Modifikasi() {
        
    }
    
    public Modifikasi(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } 
        else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            String x = data[top];
            top--;
            System.out.println("\nData yang keluar : " + x);
        } 
        else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("\nElemen teratas " + data[top]);
    }

    public void print() {
        System.out.println("\nIsi stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }
        else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
