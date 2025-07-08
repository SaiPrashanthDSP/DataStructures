package Trees;

public class InserBST {

    static Node insert(Node n,int key) {
        if(n == null) {
            n = new Node(key);
            return n;

        }
        if(n.root > key) {
            n.left = insert(n.left,key);
        } else if (n.root < key) {
            n.right = insert(n.right,key);
        }
return n;
    }
    public static void main(String[] args) {
         Node n = TreeData.getBinarySearchTreeData();
        LevelOrderTraversal.levelOrderTraversal(n);
        System.out.println();
        insert(n,14);
        LevelOrderTraversal.levelOrderTraversal(n);

    }
    }
