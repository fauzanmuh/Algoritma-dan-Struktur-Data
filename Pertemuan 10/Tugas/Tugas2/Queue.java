package Tugas2;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Queue {
    int max, size;
    int front, rear;
    Nasabah q[];
    Scanner sc = new Scanner(System.in);

    public Queue(int max) {
        this.max = max;
        create();
    }

    public void create() {
        q = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(size == max) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen terdepan: ");
            System.out.println("------------------------");
            q[front].print();
        } 
        else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } 
        else {
            int i = front, a = 1;
            while(i != rear) {
                System.out.println("-----Nasabah ke-" + a + "-------");
                q[i].print();
                a++;
                i = (i + 1) % max;
            }
            System.out.println("-----Nasabah ke-" + a + "-------");
            q[i].print();
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Enqueue(int data) {
        if(isFull()) {
            System.out.println("Antrian sudah penuh");
        } 
        else {
            boolean cek = false;
            for(int i = 0; i < size; i++) {
                if(q[i].noRekening.equals(Integer.toString(data))) {
                    cek = true;
                    break;
                }
            }
            if(cek) {
                System.out.println("No rekening sudah ada, masukkan yang lain!");
            } 
            else {
                if (isEmpty()) {
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
                System.out.print("Masukkan Nama: ");
                String nama = sc.nextLine();
                q[rear] = new Nasabah(Integer.toString(data), nama);
                size++;
            }

        }
    }

    public int Dequeue() {
        int data = 0;
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } 
        else {
            data = Integer.parseInt(q[front].noRekening);
            size--;
            if (isEmpty()) {
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

    public void peekRear() {
        if(!isEmpty()) {
            System.out.println("Elemen terbelakang: ");
            System.out.println("------------------------");
            q[rear].print();
        } 
        else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(int data) {
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } 
        else {
            int i = front, posisi = -1;
            while(i != rear) {
                if (q[i].noRekening.equals(Integer.toString(data))) {
                    posisi = i;
                    break;
                }
                i = (i + 1) % max;
            }
            if(posisi != -1) {
                System.out.println("Posisi data");
                System.out.println("------------------------");
                q[posisi].print();
                System.out.println("Berada pada antrian ke- " + (posisi + 1));
            } 
            else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    public void printNasabah(int position) {
        if(!isEmpty()) {
            if(position < 1 || position > max) {
                System.out.println("Posisi antrian yang anda masukkan tidak ada");
            } 
            else {
                System.out.println("Elemen pada antrian ke " + position + " : ");
                System.out.println("------------------------");
                q[position - 1].print();
            }
        } 
        else {
            System.out.println("Antrian masih kosong");
        }
    }
}
