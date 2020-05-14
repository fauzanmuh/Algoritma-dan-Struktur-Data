package Tugas1234;

/**
 *
 * @author FauzanOIOI
 */
public class BinaryTree {
   Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if(isEmpty()) {
            root = new Node(data);
        }
        else {
            Node current = root;
            while(true) {
                if(data < current.data) {
                    if(current.left != null) {
                        current = current.left;
                    } 
                    else {
                        current.left = new Node(data);
                        break;
                    }
                }
                else if (data > current.data) {
                    if(current.right != null) {
                        current = current.right;
                    } 
                    else {
                        current.right = new Node(data);
                        break;
                    }
                } 
                else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if(current.data == data) {
                hasil = true;
                break;
            }
            else if (data < current.data) {
                current = current.left;
            } 
            else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if(node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if(isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            }
            else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } 
            else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current == null) {
            System.out.println("Couldn't find data!");
            return;
        }
        else {
            if(current.left == null && current.right == null) {
                if(current == root) {
                    root = null;
                } 
                else {
                    if(isLeftChild) {
                        parent.left = null;
                    } 
                    else {
                        parent.right = null;
                    }
                }
            } 
            else if(current.left == null) {//if there is 1 child (right)
                if(current == root) {
                    root = current.right;
                }
                else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } 
                    else {
                        parent.right = current.right;
                    }
                }
            } 
            else if(current.right == null) {//if there is 1 child (left)
                if(current == root) {
                    root = current.left;
                }
                else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    }
                    else {
                        parent.right = current.left;
                    }
                }
            }
            else {
                Node successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                }
                else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } 
                    else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    
    //Tugas 1
    Node addRekursif(Node current, int data) {
        if(isEmpty()) {
            current = new Node(data);
            return current;
        }
        if(data < current.data) {
            if(current.left != null) {
                current.left = addRekursif(current.left, data);
            } 
            else {
                current.left = new Node(data);
            }
        } 
        else if(data > current.data) {
            if(current.right != null) {
                current.right = addRekursif(current.right, data);
            } 
            else {
                current.right = new Node(data);
            }
        }
        return current;
    }

    void insert(int data) {
        root = addRekursif(root, data);
    }
    
    //Tugas 2
    int findMax(Node node) {
        if(node == null) {
            return Integer.MIN_VALUE;
        }
        int max = node.data;
        int left = findMax(node.left);
        int right = findMax(node.right);
        if(left > max) {
            max = left;
        }
        if(right > max) {
            max = right;
        }
        return max;
    }

    int findMin(Node node) {
        if(node == null) {
            return Integer.MAX_VALUE;
        }
        int min = node.data;
        int left = findMin(node.left);
        int right = findMin(node.right);
        if(left < min) {
            min = left;
        }
        if(right < min) {
            min = right;
        }
        return min;
    }
    
    //Tugas 3
    void cetakLeaf(Node node) {
        if(isEmpty()) {
            System.out.println("Tree masih kosong");
        }
        if(node.left == null && node.right == null) {
            System.out.print(" " + node.data);
        }
        else {
            if(node.left != null) {
                cetakLeaf(node.left);
            }
            if(node.right != null) {
                cetakLeaf(node.right);
            }
        }
    }
    
    //Tugas 4
    int hitungLeaf(Node node) { 
        if(node == null) 
            return 0; 
        if(node.left == null && node.right == null) 
            return 1; 
        else
            return hitungLeaf(node.left) + hitungLeaf(node.right); 
    } 
}