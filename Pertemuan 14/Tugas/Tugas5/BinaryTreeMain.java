package Tugas5;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class BinaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        
        int pilih = 0, data;
        do {
            System.out.println("=====Binary Tree=====");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse inOrder");
            System.out.println("5. Traverse preOrder");
            System.out.println("6. Traverse postOrder");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu\t: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("==Add==");
                    System.out.print("Masukkan data\t: ");
                    data = sc.nextInt();
                    bt.add(data);
                    break;
                case 2:
                    if(bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } else {
                        System.out.println("==Delete==");
                        System.out.print("Data\t: ");
                        bt.traverseInOrder(bt.root);
                        System.out.print("\nMasukkan data yang ingin dihapus\t: ");
                        data = sc.nextInt();
                        bt.delete(data);
                    }
                    break;
                case 3:
                    if(bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } 
                    else {
                        System.out.println("==Find==");
                        System.out.print("Masukkan data yang ingin dicari\t: ");
                        data = sc.nextInt();
                        if(bt.find(data)) {
                            System.out.println("Data ditemukan!");
                        }
                        else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                    break;
                case 4:
                    if(bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } 
                    else {
                        System.out.println("==Traverse inOrder==");
                        bt.traverseInOrder(bt.root);
                        System.out.println("");
                    }
                    break;
                case 5:
                    if(bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } 
                    else {
                        System.out.println("==Traverse preOrder==");
                        bt.traversePreOrder(bt.root);
                        System.out.println("");
                    }
                    break;
                case 6:
                    if(bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } 
                    else {
                        System.out.println("===Traverse postOrder===");
                        bt.traversePostOrder(bt.root);
                        System.out.println("");
                    }
                    break;
                case 7:
                    System.out.println("==Keluar==");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Ada!");
            }
            System.out.println("====================\n");
        } 
        while (pilih != 7);
    }
}