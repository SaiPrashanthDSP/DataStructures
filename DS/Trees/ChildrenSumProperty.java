package Trees;

public class ChildrenSumProperty {

    static boolean isChildrenSumPropertySatisfied(Node n) {
        if(n== null) return true;
        int sum = 0;
        if(n.left == null && n.right == null) return true;
        if(n.left != null) {
            sum+=n.left.root;
        }
        if(n.right != null) {
            sum+=n.right.root;
        }

        return n.root == sum && isChildrenSumPropertySatisfied(n.left) && isChildrenSumPropertySatisfied(n.right);
    }
    public static void main(String []args) {
        Node n = new Node(30);
        n.left= new Node(20);
//        n.left.left = new Node(40);
//        n.left.right = new Node(5);
        n.right = new Node(10);
//        n.right.left = new Node(8);
//        n.right.right = new Node(30);
//        n.right.right.left = new Node(70);
//        n.right.right.right = new Node(9);

        System.out.println(isChildrenSumPropertySatisfied(n));
    }
}
