package Trees;

import java.util.ArrayList;
import java.util.List;

public class ConvertBSTToBalancedBST {

    static Node BSTtoBalancedBST(List<Integer> list,int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node(list.get(mid));


        node.left = BSTtoBalancedBST(list,start,mid-1);
        node.right = BSTtoBalancedBST(list,mid+1,end);

        return  node;
    }

    static List<Integer> inOrderTraversal(Node n,List<Integer> list) {
         if(n == null) return list;
         inOrderTraversal(n.left,list);
         list.add(n.root);
         inOrderTraversal(n.right,list);
         return list;
    }
    public static void main(String []args) {
        Node n = TreeData.getData();
        LevelOrderTraversal.levelOrderTraversal(n);
       System.out.println();
        List<Integer> list = inOrderTraversal(n, new ArrayList<>());
        n = BSTtoBalancedBST(list,0,list.size()-1);
        LevelOrderTraversal.levelOrderTraversal(n);
    }
}
