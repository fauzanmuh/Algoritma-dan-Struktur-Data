package minggu8;

/**
 *
 * @author FauzanOIOI
 */
public class Queue {
    int max, size;
    int front, rear;
    int Q[];
    
    public Queue(int n) {
        max = n;
        Create();
    }
    
    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty() {
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean IsFull() {
        if(size == max) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void peek() {
        if(!IsEmpty()) {
            System.out.println("Elemen terdepan: "+Q[front]);
        }
        else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void print() {
        if(IsEmpty()) {
            System.out.println("Antrian Masih kosong");
        }
        else {
            int i = front;
            while(i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = "+size);
        }
    }
    
    public void Enqueue(int data) {
        if(IsFull()) {
            System.out.println("Antrian sudah penuh");
        }
        else {
            if(IsEmpty()) {
                front = rear = 0;
            }
            else {
                if(rear == max - 1) {
                    rear = 0;
                }
                else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    
    public int Dequeue() {
        int data = 0;
        if(IsEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        else {
            data = Q[front];
            size--;
            if(IsEmpty()) {
                front = rear = -1;
            }
            else {
                if(front == max - 1) {
                    front = 0;
                }
                else {
                    front++;
                }
            }
        }
        return data;
    }
}
