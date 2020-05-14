package Tugas1234;

/**
 *
 * @author FauzanOIOI
 */
public class BinarryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        bt.insert(10);
        bt.insert(15);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Nilai terbesar : " +bt.findMax(bt.root));
        System.out.println("Nilai terkecil : " +bt.findMin(bt.root));
        System.out.print("Leaf : ");
        bt.cetakLeaf(bt.root);
        System.out.println("");
        System.out.println("Jumlah leaf : " +bt.hitungLeaf(bt.root));
    }
}