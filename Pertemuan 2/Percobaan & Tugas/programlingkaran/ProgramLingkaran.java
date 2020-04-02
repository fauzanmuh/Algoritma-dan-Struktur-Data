package programlingkaran;

/**
 *
 * @author FauzanOIOI
 */
public class ProgramLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        l1.r = 7;
        
        System.out.println("Luas Lingkaran = " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran = " + l1.hitungKeliling());
    }    
}