package quiz2;

/**
 *
 * @author FauzanOIOI
 */
public class th2019<T> {
     T data;
    th2019<T> next;

    public th2019(T data, th2019<T> next) {
        this.data = data;
        this.next = next;
    }
}