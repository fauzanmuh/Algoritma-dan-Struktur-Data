package Tugas3;

/**
 *
 * @author FauzanOIOI
 */
public class FaktorialBF {
    //Algoritma Brute Force
    public int faktorialBF(int n){
        int faktor = 1; //0(1)
        int i = 1; //0(1)
        
        while(i<= n){ //0(n)
            faktor = faktor*i; //0(1)
            i++; //0(1)
        }
        return faktor; //0(1)
    }
}

// = 0(1+1+(n*1*1)+1)
// = 0(3+n)
// = 0(n)
