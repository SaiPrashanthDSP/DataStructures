package Trees;

public class DeleteInBST {

    static Node deleteNode(Node n,int targetValue) {
       if(n == null) return null ;
       if(targetValue < n.root) {
           n.left = deleteNode(n.left,targetValue);
       } else if (targetValue > n.root) {
          n.right =  deleteNode(n.right,targetValue);
       } else {
           if (n.left == null) return n.right;
           else if (n.right == null) { return n.left;

           } else  {
               Node temp = findMin(n.right);
               n.root = temp.root ;
               n.right = deleteNode(n.right, temp.root);
           }

       }
       return n;
    }
   static Node findMin(Node n) {
        while (n!= null && n.left != null) {
            n = n.left;
        }
        return n;
    }

    static void inOrderTraversal(Node n) {
        if (n == null) return;
        inOrderTraversal(n.left);
        System.out.println(n.root);
        inOrderTraversal(n.right);
    }
    public static void main(String[] args) {
        Node n = TreeData.getBinarySearchTreeData();
        LevelOrderTraversal.levelOrderTraversal(n);
         System.out.println();
        deleteNode(n,10);
        LevelOrderTraversal.levelOrderTraversal(n);

    }
}
