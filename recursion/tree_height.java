import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}

class BST{
    public Node createNewNode(int k){
        Node a =new Node();
        a.data=k;
        a.left=null;
        a.right=null;
        return a;
    }
    public Node insert(Node node , int val){
        if(node==null)
            return createNewNode(val);
            
        if(val<node.data) 
            node.left=insert(node.left, val);
            
        if(val>node.data)
            node.right=insert(node.right, val);
            
        return node;    
    }
    int height(Node root){
        if(root==null)
            return 0;
            
        int lh=height(root.left);
        int rh=height(root.right);
        
        return Math.max(lh,rh)+1;
    }
    
}
public class Main{
    public static void main(String args[]) throws Exception{
        BST a=new BST();
        Node root=null;
        
        root=a.insert(root,8);
        root=a.insert(root,3);
        root=a.insert(root,6);
        root=a.insert(root,10);
        root=a.insert(root,4);
        root=a.insert(root,7);
        root=a.insert(root,1);
        root=a.insert(root,14);
        root=a.insert(root,13);
        // a.preorder(root);
        System.out.println(a.height(root));
        
        
        
    }
}
