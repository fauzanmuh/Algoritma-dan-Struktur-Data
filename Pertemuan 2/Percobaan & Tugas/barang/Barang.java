package barang;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Barang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		BarangInput br = new BarangInput();

		System.out.print("Masukkan Nama anda : ");
		br.nama = sc.nextLine();
		System.out.print("Harga Barang : Rp. ");
		br.hargaSatuan = sc.nextInt();
		System.out.print("jumlah barang : ");
		br.jumlah = sc.nextInt();

		System.out.println("Nama\t\t\t = " + br.nama);
		System.out.println("Harga Satuan Barang\t = " + br.hargaSatuan);
		System.out.println("Harga Total \t\t = " + br.hitungHargaBayar());
	}
    }   