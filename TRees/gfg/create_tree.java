import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data1){
        data=data1;
        left=null;
        right=null;
    }
}
class Main{
    Node root;
    Main(){
        root=null;
    }


void preOrder(Node root){
    if(root==null)
        return;
        
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}
void preOrder(){
    preOrder(root);
}


public static void main(String args[]) throws Exception{
    Main tree=new Main();
    tree.root=new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    System.out.println("Pre order");
    tree.preOrder();
}
}

