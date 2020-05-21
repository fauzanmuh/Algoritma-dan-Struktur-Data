package Tugas6;

/**
 *
 * @author FauzanOIOI
 */
public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(Node prev, T data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}