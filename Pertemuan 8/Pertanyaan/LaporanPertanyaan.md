Nama    : Muhammad Fauzan

Kelas   :TI 1F

NIM     : 1941720171

# STACK #

# Pertanyaan 8.3.3 #

1. Fungsi dari angka 4 yaitu untuk menentukan ukuran dari stack 
yang akan dibuat, angka 4 berarti ukuran stack adalah 4, dan 
fungsi ini merujuk pada konstruktor pada class Stack.

2. 
<img src = "21.png">
<img src = "22.png">

3. Karena pada tahap pertama stack telah terisi penuh dengan 4 
elemen, lalu stack di-pop agar mengeluarkan elemen teratas, 
sehingga isi stack saat ini terisi 3 elemen dan 1 kosong, 17 
dapat menempati kekosongan tersebut, sedangkan 98 tidak bisa 
karena isi stack sudah penuh, dan output menampilkan isi stack 
sudah penuh!

4.
<img src = "41.png">
<img src = "42.png">

5. Karena pada program, variabel top digunakan untuk menentukan 
indeks dari data terbaru, dan ini menentukan data teratas pada 
stack, karena indeks stack dimulai dari 0, ketika data baru 
diinputkan, maka top akan ditambahkan dengan 1, begitu seterusnya.

# Pertanyaan 8.4.3 #

1. Pada mata kuliah teori Algoritma dan Struktur data, pada 
materi Stack ada penjelasan mengenai derajat operator matematika, 
penjelasan ini sesuai dengan fungsi presedence pada praktikum, 
yaitu menentukan operator yang mana terlebih dahulu yang harus di 
pop ke postfix.

2.
<img src = "P2.png">

3. Tanda kurung tidak dimasukkan ke postfix, pada kode program 
juga ditunjukkan aturan ini, program push operator kurung buka ('
(') ke stack lalu ketika terdapat operator kurung tutup (')') 
semua stack di pop ke postfix dan operator kurung buka maupun 
kurung tutup diabaikan.

4. 
<img src = "P4.png">

Ini karena tanda @ dan # tidak memenuhi semua pengecekan apakah 
tanda tersebut bagian dari operand, atau operator, sehingga tanda 
ini tidak dipush ke stack ataupun postfix.