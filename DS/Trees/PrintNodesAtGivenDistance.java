package Trees;

public class PrintNodesAtGivenDistance {

    static void printNode(Node n, int distance) {
       if(n == null) return;
       if(distance == 0) {
           System.out.println(n.root);
       } else {
           printNode(n.left,distance-1);
           printNode(n.right,distance-1);

       }

    }
    public static void main(String []args) {
        Node n = new Node(10);
        n.left= new Node(20);
//        n.left.left = new Node(40);
//        n.left.right = new Node(5);
        n.right = new Node(30);
//        n.right.left = new Node(8);
//        n.right.right = new Node(30);
//        n.right.right.left = new Node(70);
//        n.right.right.right = new Node(9);
        printNode(n,1);
    }

    }
