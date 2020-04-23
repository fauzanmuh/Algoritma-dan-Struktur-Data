package quiz2;

/**
 *
 * @author FauzanOIOI
 */
public class th2020<T> {
     T data;
    th2020<T> next;

    public th2020(T data, th2020<T> next) {
        this.data = data;
        this.next = next;
    }
}
