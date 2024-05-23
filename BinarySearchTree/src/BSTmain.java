import java.util.Arrays;

public class BSTmain {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(6);
        root.left.left=new Node(1);
        root.left.right=new Node(4);
//        System.out.println(bst.insert(root,7));
//        System.out.println(bst.insert(root,9));
        System.out.println(bst.preOrder(root));
        System.out.println(bst.levelOrder(root));
        System.out.println(bst.floor(root,6));
        System.out.println(bst.findCeil(root,2));
    }
}
