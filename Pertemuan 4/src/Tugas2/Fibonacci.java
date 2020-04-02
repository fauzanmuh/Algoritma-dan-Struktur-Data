package Tugas2;

/**
 *
 * @author FauzanOIOI
 */
public class Fibonacci {
    static int fibo(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        }
        else {
            return (fibo(angka - 1) + fibo(angka - 2));
        }
    }
}
