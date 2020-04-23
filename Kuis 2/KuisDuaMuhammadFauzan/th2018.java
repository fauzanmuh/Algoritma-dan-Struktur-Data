package quiz2;

/**
 *
 * @author FauzanOIOI
 */
public class th2018<T> {
    T data;
    th2018<T> next;

    public th2018(T data, th2018<T> next) {
        this.data = data;
        this.next = next;
    }
}
