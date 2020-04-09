Nama    : Muhammad Fauzan

Kelas   : TI 1F

NIM     : 1941720171

# Pertanyaan #

# 10.3.3 #

1. Q : variabel untuk menyimpan data queue

2. FRONT : Untuk menyimpan nilai indeks array data terdepan,
REAR : Untuk menyimpan nilai indeks array data paling belakang,
SIZE : Untuk menyimpan berapa banyak data yang ada dalam antrian,
MAX : Untuk menyimpan banyak data maksimal yang bisa disimpan di 
dalam queue.

3. Karena nilai -1 Sebagai nilai awal yang menunjukkan bahwa 
queue berada pada kondisi kosong, dan karena nilai awal dari 
indeks selalu dimulai dari 0, maka atribut front dan 
rear tidak diinisialisasikan dengan nilai 0. 

4. Jika kondisi if diubah menjadi size == max-1,
Maka Jumlah dari queue yang dapat diisi menjadi berkurang satu. 
Sehingga apabila dimasukkan panjang queue semisal 4, maka menjadi 
hanya 3 kali pengisian, yaitu menempati indeks ke 0, 1 dan 2.

5. Sebuah program pengecekan jika rear sudah berada pada indeks 
maks-1 (indeks terakhir array) maka rear akan direset ke 0 lagi 
seperti pada awalnya tadi. 

6. <img src = "5.png">

7. Karena dequeue mengeluarkan suatu data dari queue sehingga 
perlu nilai kembalikan berupa data yang keluar dari antrian. 

8. <img src = "8&9.png">

9. Apabila data paling depan dari queue berada di indeks terakhir 
pada array, maka kemudian ketika dilakukan pengambilan data, maka 
yang diambil adalah data pada indeks terakhir,dan posisi front menjadi bergeser ke indeks ke-0.

10. <img src = "8&9.png">

11.  Pada proses perulangan variabel i tidak dimulai dari 0 (int 
i=0), melainkan int i=front Karena bisa saja antrian paling depan 
sudah di dequeue sehingga posisi paling depan bukan lagi indeks 
ke-0, karena itu dibutuhkan variabel tambahan untuk menyimpan 
posisi front.

12. i merupakan iterasi perulangan while dimana i=front dan di 
iterasikan dengan (i+1) modulo max. Contoh max = 6. Front = 2,
jadi operasi yang berlangsung i = (2+1) mod 6 → i = 3 mod 6 → i = 3. Dan perulangan tersebut akan berhenti ketika nilai i = rear.

13. Pada class Queue

    <img src = "queue.png">

    Pada QueueMain
    <img src = "Main1.png">
    <img src = "Main2.png">
    <img src = "Main3.png">