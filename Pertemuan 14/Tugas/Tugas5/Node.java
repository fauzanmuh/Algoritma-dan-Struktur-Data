package Tugas5;

/**
 *
 * @author FauzanOIOI
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node() {
    }
    
    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}