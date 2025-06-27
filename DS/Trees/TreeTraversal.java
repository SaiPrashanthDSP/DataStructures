package Trees;
class  Node {
    int root;
    Node left;
    Node right;
    Node(int key) {
        root = key;
        left = null;
        right = null;
    }
}
public class TreeTraversal {
    public static void main(String[]args) {
        Node n = new Node(10);
        n.left= new Node(20);
        n.left.left = new Node(40);
        n.left.right = new Node(5);
        n.right = new Node(30);
        n.right.left = new Node(8);
        n.right.right = new Node(30);
        n.right.right.left = new Node(70);
        n.right.right.right = new Node(9);
        inOrderTraversal(n);
        preOrderTraversal(n);
        postOrderTraversal(n);
    }

    static void inOrderTraversal(Node node) {
        if(node != null) {
            inOrderTraversal(node.left);
             System.out.println(node.root);
             inOrderTraversal(node.right);
        }


    }
    static void preOrderTraversal(Node node) {
        if(node != null) {
            System.out.println(node.root);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }


    }
    static void postOrderTraversal(Node node) {
        if(node != null) {
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
            System.out.println(node.root);

        }


    }
}
