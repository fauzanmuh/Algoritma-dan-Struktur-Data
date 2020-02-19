package programsewa;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class ProgramSewa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Persewaan Video Game ");

		Sewa sw = new Sewa();

		Sewa[] sewa = new Sewa[2];
		sewa[0] = new Sewa();
		sewa[0].id =  1487;
		sewa[0].game = "Batman Lego";
		sewa[0].harga = 3000;

		sewa[1] = new Sewa();
		sewa[1].id = 1458;
		sewa[1].game = "God Of War";
		sewa[1].harga = 5000;

		System.out.print("Masukkan nama anda : ");
		sw.nama = sc.nextLine();

		System.out.println("Game");
		for (int i = 0; i < sewa.length ; i++) {
			System.out.println((i+1) + ".) " + sewa[i].game );
		}
		System.out.print("Masukkan pilihan : ");
		sw.select = sc.nextInt();

		if (sw.select > 0 && sw.select <= (sewa.length)) {
			System.out.print("Sewa berapa hari : ");
			sw.hari = sc.nextInt();
			System.out.println("\nData : ");
			System.out.println("id\t\t = " + sewa[(sw.select-1)].id);
			System.out.println("Nama\t\t = " + sw.nama);
			System.out.println("Game\t\t = " + sewa[(sw.select-1)].game);
			System.out.println("Lama Pinjam\t = " + sw.hari + " Hari ");
			System.out.println("Harga\t\t = " + (sewa[(sw.select-1)].harga * sw.hari));
		}
                else{
			System.exit(0);
		}
	}
    }