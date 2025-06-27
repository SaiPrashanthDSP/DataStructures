package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static void levelOrderTraversal(Node n) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(n);
        q.add(null);
        while(q.size() >1) {
       // while(!q.isEmpty()) {
            Node node = q.poll();

            if(node == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(node.root + " ");

            if(node.left != null) {
                q.add(node.left);
            }
            if(node.right != null) {
                q.add(node.right);
            }
        }
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
        levelOrderTraversal(n);
    }
}
