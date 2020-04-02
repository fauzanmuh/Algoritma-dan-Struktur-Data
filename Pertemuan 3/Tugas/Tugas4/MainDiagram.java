package Tugas4;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainDiagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("  Pemilihan Suara Ketua BEM thn 2020  ");
        System.out.println("--------------------------------------");
        Diagram bem = new Diagram();
        Diagram [] dm = new Diagram [bem.jmlKandidat];
		
        for (int i = 0; i < bem.jmlKandidat  ; i++) {
            dm[i] = new Diagram();
            System.out.print("Nama Kandidat ke-" + (i+1) + " : ");
            dm[i].kandidat = sc.nextLine();
        }
         System.out.println("--------------------------------------");
        for (int i = 0; i < bem.jmlKandidat ; i++) {
            System.out.print("Jumlah Suara kandidat ke -" + (i+1) + " : ");
            dm[i].suara = sc.nextInt();
            bem.jmlSuara += dm[i].suara;
	}
        System.out.println("--------------------------------------");
            int hasil = bem.hitung(bem.jmlSuara , dm[0].suara , dm[1].suara, dm[2].suara, dm[3].suara);
	if (hasil == 0) {
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
	}else{
            System.out.println("Ketua BEM yang terpilih adalah " + dm[hasil-1].kandidat);
	}
    }
}
