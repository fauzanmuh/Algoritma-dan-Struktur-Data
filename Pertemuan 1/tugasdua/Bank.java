package tugasdua;

/**
 *
 * @author FauzanOIOI
 */
public class Bank {
    public static void main(String[] args) {
        int bul = 0;
        double duit = 1000000, bunga = 0.02;
        System.out.printf(" Saldo Anda\t : Rp %,.2f\n", duit);
        for (bul=0; duit<1500000; bul++) {
            duit += duit * bunga;
        }
        System.out.printf(" Dalam Waktu\t : %d Bulan\n Uang Anda\t : Rp %,.2f\n", bul, duit);
    }
}
