package Trees;

public class TreeData {

    static  Node getBinarySearchTreeData() {
        Node node = new Node(20);
        node.left = new Node(10);
        node.left.left = new Node(8);
        node.left.right = new Node(15);

        node.right = new Node(40);
        node.right.left = new Node(30);
        node.right.right = new Node(50);

        return node;

    }
    static  Node getData() {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        return root;
    }
}
