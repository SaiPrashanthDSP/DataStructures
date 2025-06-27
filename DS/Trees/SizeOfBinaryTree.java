package Trees;

public class SizeOfBinaryTree {

    static int findSizeOfBinaryTree(Node n) {
        if(n == null) return 0;
        return  1+ findSizeOfBinaryTree(n.left)+findSizeOfBinaryTree(n.right);
    }
    public static void main(String [] args) {
        Node n = new Node(10);
        n.left= new Node(20);
        n.left.left = new Node(40);
        n.left.right = new Node(5);
        n.right = new Node(30);
        n.right.left = new Node(8);
        n.right.right = new Node(30);
        n.right.right.left = new Node(70);
        n.right.right.right = new Node(9);
        System.out.println(findSizeOfBinaryTree(n));
    }
}
