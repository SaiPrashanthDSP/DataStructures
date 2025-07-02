package Trees;

public class SearchInBST {

    static boolean binarySearch(Node n, int targetValue) {
        if(n == null) return false;
//       if(n.root == targetValue) return true;
        if(n.root > targetValue) return binarySearch(n.left,targetValue);
        else if (n.root < targetValue) return binarySearch(n.right,targetValue);
         else return true;

    }
    public static void main(String []args) {
        Node n = new Node(15);
        n.left = new Node(5);
        n.left.left = new Node(3);
        n.right = new Node(20);
        n.right.left = new Node(18);
        n.right.right = new Node(80);
        n.right.left.left = new Node(16);

        System.out.println(binarySearch(n,16));
    }
}
