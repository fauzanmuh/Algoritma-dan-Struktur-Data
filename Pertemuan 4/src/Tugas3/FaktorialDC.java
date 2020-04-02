package Tugas3;

/**
 *
 * @author FauzanOIOI
 */
public class FaktorialDC {
    //Algoritma Divide Conquer
    public int faktorialDC(int n){
        if(n==1){ //0(1)
            return 1; //0(1)
        }
        else{
            int faktor = n*faktorialDC(n-1); //0(1)
            return faktor; //0(1)
        }
    }
}

// = 0(1+1+1+1)
// = 0(4)