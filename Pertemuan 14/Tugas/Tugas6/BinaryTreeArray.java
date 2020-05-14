package Tugas6;

/**
 *
 * @author FauzanOIOI
 */
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(int arr, int idxLast){
        data = new int[arr];
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart]+ " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
    void add(int databa) {
        if(data[0] == 0) {
            data[0] = databa;
        }
        int idx = 0;
        
        while(true) {
            if(databa < data[idx]){
                if(data[2 * idx + 1]!=0){
                    idx = (2 * idx)+1;
                }
                else{
                    data[2 * idx + 1] = databa;
                    break;
                }
            }
            else if(databa > data[idx]){
                if(data[2 * idx + 2]==0){
                    data[2 * idx + 2] = databa;
                    break;
                }
                else{
                    idx=2 * idx + 2;
                }
            }
            else {
                break;
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if(idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if(idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(data[idxStart]+ " ");
        }
    }
}