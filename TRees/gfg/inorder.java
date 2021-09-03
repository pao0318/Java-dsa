import java.util.*;
public class Main{
    static class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key=key;
            left=right=null;
        }
    }
    static Node root;
    static Node temp=root;
    // Inorder traversal
    static void inOrder(Node temp){
        if(temp==null)
            return;
        inOrder(temp.left);
        System.out.println(temp.key+" ");
        inOrder(temp.right);
    }
    static void insert(Node temp, int key){
        if(temp==null)
            return;
        Queue<Node>pq=new LinkedList<>();
        pq.add(temp);
        // Do level order traversal until we find
        // an empty place.
        while(!pq.isEmpty()){
            temp=pq.poll();
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else
                pq.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                pq.add(temp.right);
        }
        
    }
    
    
    
    
    public static void main(String args[]) throws Exception{
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.print("Inorder traversal before insertion:");
        inOrder(root);
 
        int key = 12;
        insert(root, key);
 
        System.out.print("\nInorder traversal after insertion:");
        inOrder(root);
    }
        
    
}
