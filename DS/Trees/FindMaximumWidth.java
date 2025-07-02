package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaximumWidth {

    static int maximumWidthOfTree(Node n) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(n);
        queue.add(null);
        int width = 0;
        while (queue.size() > 1) {
            Node node = queue.poll();
            if (node == null) {
                width = Math.max(width,queue.size());

                queue.add(null);

                continue;
            }
            if(node.left != null) {
                queue.add(node.left);

            }
            if(node.right != null) {
                queue.add(node.right);

            }

        }
        return width;
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
        n.right.right.right = new Node(9);
        System.out.println(maximumWidthOfTree(n));

    }
}
