package Tugas5;

/**
 *
 * @author FauzanOIOI
 */
public class Bem {
    public int n, c1, c2, c3;
    public int pilihan[] = new int[n];
    public int masuk;

    Bem (int masuk) {
        this.masuk = masuk;
        this.pilihan = new int[masuk];
    }
    int pemilihanBem(int n){
        if(n == pilihan.length-1){
            return 0;
        }else
            if(pilihan[n]==1){
                c1+=1;
            }else if(pilihan[n]==2){
                c2+=1;
            }else if(pilihan[n]==3){
                c3++;
            }
        return pemilihanBem(n+1);
        }
    }