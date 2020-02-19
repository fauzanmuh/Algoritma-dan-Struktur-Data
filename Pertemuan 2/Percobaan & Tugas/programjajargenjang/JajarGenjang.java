package programjajargenjang;

/**
 *
 * @author FauzanOIOI
 */
public class JajarGenjang {
    public int tinggi;
    public int alas;
    public int sisiMiring;
    
    public int hitungLuas() {
        return alas * tinggi;
    }
    public int hitungKeliling() {
        return 2 * (alas + tinggi);
    }
}