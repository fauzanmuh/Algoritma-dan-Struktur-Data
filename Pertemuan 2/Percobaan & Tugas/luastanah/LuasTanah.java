package luastanah;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class LuasTanah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		Luas ls = new Luas();

		System.out.print("Masukkan jumlah tanah : ");
		ls.jumlah = sc.nextInt();
		
		Luas[] tanah = new Luas[ls.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new Luas();

			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = sc.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = sc.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + ls.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}
        }
}