package Praktikum1;

/**
 *
 * @author FauzanOIOI
 */
public class minMax {
    public int nilaiArray;
    public int maximum;
    public int minimum;
    
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, minMax hasil) {
        int indeks_tengah;
        minMax hasil1 = new minMax();
        minMax hasil2 = new minMax();
        
        if(indeks_awal == indeks_akhir) {
            hasil.minimum = hasil.minimum = arr[indeks_awal];
        }
        else if(indeks_akhir - indeks_awal == 1) {
            if(arr[indeks_awal] > arr[indeks_akhir]) {
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            }
            else {
                indeks_tengah = (indeks_awal + indeks_akhir)/2;
                max_min(arr, indeks_awal, indeks_tengah, hasil1);
                max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);
                
                hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;
                hasil1.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;
            }
        }
    }
}
