import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+",");
        inorder(root.right);
    }
    boolean search(Node root, int x) {
        // Your code here
        if(root==null)
            return false;
        if(root.data==x)
            return true;
        else if(x<root.data)
            return search(root.left,x);
        else
            return search(root.right,x);
    }
    Node insert(Node root, int Key) {
        if(root==null)
            return new Node(Key);
        if(Key<root.data)
            root.left=insert(root.left,Key);
        else if(Key>root.data)
            root.right=insert(root.right,Key);

        return root;
    }
    public  ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> q = new Stack<>();
        if (root == null)
            return arr;
        q.push(root);
        while (!q.isEmpty()) {
            Node curr = q.pop();
            arr.add(curr.data);
            if (curr.left != null)
                q.push(curr.left);
            if (curr.right != null)
                q.push(curr.right);
        }
        return arr;
    }
        ArrayList<Integer> inOrder(Node root)
        {
         ArrayList<Integer> arr=new ArrayList<>();
         Stack<Node> st=new Stack<>();
         Node curr=root;
         while(curr!=null || !st.isEmpty()){
             while(curr!=null) {
                 st.push(curr);
                 curr=curr.left;
             }
             curr=st.pop();
             arr.add(curr.data);
             curr=curr.right;
         }
         return arr;
        }
        ArrayList<Integer> postOrder(Node root)
        {
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null)
            return arr;
        Stack<Node> st=new Stack<>();
        Node curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=curr.right;
            curr=st.pop();
            arr.add(curr.data);
        }
        return arr;
        }
        ArrayList<Integer> levelOrder(Node root)
        {
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null)
            return arr;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            arr.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }

        }
        return arr;
        }
    int floor(Node root, int key) {
        int res=-1;
        while (root!=null) {
            if (root.data == key)
                return root.data;
            else if (root.data>key) {
                root = root.left;
            }
            else{
                res=root.data;
                root = root.right;
            }
        }
        return res;
    }
    int findCeil(Node root, int key) {
        int res=-1;
        while (root!=null) {
            if (root.data == key)
                return key;
            else if (root.data < key)
                root = root.right;
            else {
                res = root.data;
                root = root.left;
            }
        }
        return res;
    }
}

