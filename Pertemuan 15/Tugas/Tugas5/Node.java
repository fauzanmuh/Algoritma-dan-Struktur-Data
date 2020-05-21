package Tugas5;

/**
 *
 * @author FauzanOIOI
 */
public class Node {
    int weight, data;
    Node prev;
    Node next;

    Node(Node prev, int data, int weight, Node next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}
