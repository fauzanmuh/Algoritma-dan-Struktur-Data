package luasmodif;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class LuasModif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Modif md = new Modif();
		md.control = 0;

		System.out.print("Masukkan jumlah tanah : ");
		md.jumlah = sc.nextInt();
		
		Modif[] tanah = new Modif[md.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new Modif();
			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = sc.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = sc.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + md.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}

		md.max = md.luasTanah(tanah[0].panjang , tanah[0].lebar);

		
 		for (int i = 0; i < tanah.length ; i++) {
 			if (md.luasTanah(tanah[i].panjang , tanah[i].lebar) > md.max) {
 				md.max = md.luasTanah(tanah[i].panjang , tanah[i].lebar);
 				md.control = i;
 			}
 		}

 		System.out.println("\nTanah yang terluas adalah tanah ke-" + (md.control+1));
 		}
}