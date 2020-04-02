package Minggu8;

/**
 *
 * @author FauzanOIOI
 */
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack tumpukan = new Stack(4);
        
        tumpukan.push(15);
        tumpukan.push(31);
        tumpukan.push(9);
        tumpukan.push(12);
        tumpukan.print();
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
