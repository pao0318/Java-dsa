import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class LCA {

    static Node root;
    public static int findlca(Node root,Node a, Node b){
        if(root==null)
            return 0;
        if(a==null||b==null)
            return 0;
        if(root.data==a.data|| root.data==b.data)
            return root.data;
        int x1= findlca(root.left,a,b);
        int x2= findlca(root.right,a,b);
        if(x1!=0 && x2!=0)
            return root.data;
        return (x1!=0)?x1:x2;

    }

    public static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        LCA tree = new LCA();
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);


        int c=findlca(root, tree.root.right ,tree.root.left.left);
        System.out.println(c);

    }
}
