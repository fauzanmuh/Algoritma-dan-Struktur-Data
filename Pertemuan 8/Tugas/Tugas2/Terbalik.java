package Tugas2;

/**
 *
 * @author FauzanOIOI
 */
public class Terbalik {
    int size, top;
    String data[];

    public Terbalik(){
        
    }
    
    public Terbalik(int size) {
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
        if(!IsFull()) {
            top++;
            data[top] = dt;
        } 
        else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void print() {
        System.out.print("\nKalimat Dibalik\t\t: ");
        for(int i = top; i >= 0; i--) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }

    public void clear() {
        if(!IsEmpty()) {
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
