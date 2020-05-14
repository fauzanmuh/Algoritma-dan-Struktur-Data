Nama    : Muhammad Fauzan

Kelas   : TI 1F

NIM     : 1941720171

# GRAPH #

# PERTANYAAN 15.3.3 #

1. Graph diimplementasikan dengan double linked list, bukan single linked list karena pada setiap node double linked list terdapat 2 atribut untuk 
menunjuk pada node lain, yaitu prev dan next. Dalam implementasi graph, atribut prev digunakan untuk menunjuk pada vertex berikutnya (sesuai urutan 
masuknya vertex ke linked lists), sedangkan atribut next digunakan untuk menunjuk pada vertex edge berikutnya jika ada.

2. Ada dua jenis looping dalam metode printGraph(), loop pertama digunakan untuk melakukan perulangan pada i, dimana i digunakan untuk memanggil 
indeks array, atau dalam kasus ini setiap indeks array berisi linked list yang berisi vertex, edge, dan vertex yang terhubung dengan edge. 
Sedangkan untuk loop kedua digunakan untuk melakukan perulangan pada j, dimana j digunakan untuk memanggil vertex edge yang terhubung pada setiap 
vertex ke-i.

3. Perbedaan antara graph dengan binary tree pada implementasinya menggunakan linked list adalah pada graph, setiap vertex mampu terhubung kepada 
vertex manapun yang diinginkan atau terjadi cycle. Sedangkan pada binary tree, setiap node memiliki parent dan child masing-masing, tidak dapat 
terhubung ke node lain.

4. Perbedaan antara edge dan path, yaitu edge hanya penghubung antar simpul dalam graph, sedangkan path adalah lintasan yang dilalui dari satu 
vertex ke vertex lain yang akan dituju melalui edge yang terhubung.

5. 
A. Adjacency list, dan diimplementasi dengan menampilkan masingmasing simpul sebagai sebuah struktur data yang mengandung senarai dari semua simpul 
yang saling berhubungan.

B. Adjacency matrix dimana baris dan kolom dari matriks (jika dalam konteks implementasi berupa array dua dimensi) tersebut merepresentasikan 
simpul awal dan simpul tujuan dan sebuah input di dalam array yang menyatakan apakah terdapat sisi di antara kedua simpul tersebut.

C. Dari kedua implementasi diatas, gabungan dari keduanya menghasilkan implementasi baru bernama Adjacency map yaitu simpul yang disimpan sebagai kunci dalam sebuah Map Structure dengan tujuan agar mempermudah pencarian sebuah simpul

6. 
A. Algoritma Kruskal, digunakan untuk menentukan pohon perentang terbobot minimum.

B. Algoritma Dijkstra, digunakan untuk menentukan lintasan terpendek pada graf berbobot.

C. Algoritma Brent, digunakan untuk menentukan adanya daur dalam graph (cycle)

7. ujuan pembuatan variabel LinkedList list[] adalah untuk membuat array dari tipe data class LinkedList. Dalam hal ini array list[] digunakan 
untuk menyimpan vertex, edge, dan vertex yang terhubung pada edgenya pada graph.

8. Pemanggilan method addFirst() dalam method addEdge() karena ketika terdapat penambahan edge maka harus ada 2 array yang diubah yaitu source atau 
asal dari edge dan destination atau tujuan dari edge. Ketika menambahkan array index source, maka node harus diberi tahu tujuan edgenya juga, dan 
pada array index destination, maka node harus diberi tahu asal edgenya juga. Sehingga antara array index source dan array index destination saling 
terhubung.

9. Dengan cara mencocokkan menggunakan perulangan pada variabel i, ketika i bernilai sama dengan parameter destination yang diinputkan, maka edge 
akan dihapus.

10. 
<img src = no10.PNG>

# PERTANYAAN 15.4.3 #

1. 
a. Pada directed graph, degree hanya dihitung sesuai jumlah masing-masing inDegree dan outDegreenya, lalu semuanya dijumlahkan.

b. Sedangkan pada undirected graph degree dihitung hanya dari berapa banyak edge yang terhubung pada vertex tersebut.
Hal ini hanya untuk memudahkan pembacaan pencetakan matriks yang membentuk representasi graph, sebenarnya bisa dimulai dari 0, tetapi semua perulangan harus dimulai dari 0.

2. Untuk memeriksa apakah ada vertex yang terhubung antara vertex <to> dan vertex <from>, jika tidak ada data yang terhubung, maka vertex tidak ada

3. Jenis directed graph

4. Karena try-catch Exception digunakan untuk mendeteksi kesalahan yang terjadi ketika menjalankan method-method yang ada.