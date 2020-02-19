package programlingkaran;

/**
 *
 * @author FauzanOIOI
 */
public class Lingkaran {
    double PHI = 3.14;
    double r;
    
    double hitungLuas() {
        return PHI * r * r;
    }
    double hitungKeliling() {
        return PHI * (2 * r);
    }
}
