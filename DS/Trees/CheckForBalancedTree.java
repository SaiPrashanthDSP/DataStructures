package Trees;

import static java.lang.Math.abs;

public class CheckForBalancedTree {

    static boolean checkIsBalancedTree(Node n) {
        if(n == null) {
            return true;
        }
        int lh = findHeightOfTheTree(n.left);
        int rh = findHeightOfTheTree(n.right);
        boolean result = abs(lh - rh) <= 1;
        return result && checkIsBalancedTree(n.left) && checkIsBalancedTree(n.right);
    }
    static int findHeightOfTheTree(Node n) {
        if(n == null || (n.left == null && n.right == null)) {
            return 0;
        }
        return (Math.max(findHeightOfTheTree(n.left),findHeightOfTheTree(n.right)))+1;
    }
    public static void main(String []args) {
        Node n = new Node(30);
        n.left= new Node(20);
        n.left.left = new Node(40);
        n.left.right = new Node(5);
        n.right = new Node(10);
        n.right.left = new Node(8);
        n.right.right = new Node(30);
        n.right.right.left = new Node(70);
      //  n.right.right.left.left = new Node(60);
        n.right.right.right = new Node(9);
        System.out.println(checkIsBalancedTree(n));
    }
}
