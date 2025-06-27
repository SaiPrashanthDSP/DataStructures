package Trees;

public class MaximumInBinaryTree {

    static int maximumElementInBinaryTree(Node n) {
        if(n == null) {
            return 0;
        }
        return Math.max(n.root,Math.max(maximumElementInBinaryTree(n.left),maximumElementInBinaryTree(n.right)));
    }
    public static void main(String [] args) {
        Node n = new Node(10);
        n.left= new Node(20);
        n.left.left = new Node(400);
        n.left.right = new Node(5);
        n.right = new Node(30);
        n.right.left = new Node(8);
        n.right.right = new Node(30);
        n.right.right.left = new Node(70);
        n.right.right.right = new Node(90);
        System.out.println(maximumElementInBinaryTree(n));
    }
}
