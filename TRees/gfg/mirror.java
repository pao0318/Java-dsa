import java.util.*;
// Node class
class Node{
    int data;
    Node left;
    Node right;
    public Node(int item){
        data=item;
        left=null;
        right=null;
}
}


class Main{
    Node root;
    void mirror(){
        root=mirror(root);
    } 
    // Mirror function
    Node mirror(Node node){
        if(node==null)
            return node;
        Node left=mirror(node.left);
        Node right=mirror(node.right);
        node.left=right;
        node.right=left;
        return node;
    }
    void inOrder(){
        inOrder(root);
    }
    void inOrder(Node node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }
    
    
    public static void Main(String []args){
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Inorder traversal of input tree is :");
        tree.inOrder();
        System.out.println("");

        /* convert tree to its mirror */
        tree.mirror();

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inOrder();
    }
}
