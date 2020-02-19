package arraysegitiga;

/**
 *
 * @author FauzanOIOI
 */
public class ArraySegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga (10, 4);
        sgArray[1] = new Segitiga (20, 10);
        sgArray[2] = new Segitiga (15, 6);
        sgArray[3] = new Segitiga (25, 10);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Luas Segitiga ke " + i + ": " +sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga ke " + i + ": " +sgArray[i].hitungKeliling());
        }
    }   
}