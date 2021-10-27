// https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
	    if(root==null)
	        return null;
	   if(root.data==n1|| root.data==n2)
	    return root;
        Node l=lca(root.left,n1,n2);
        Node r=lca(root.right,n1,n2);
        
        if(l!=null && r!=null)
            return root;
        else if(l==null)
            return r;
        else
            return l;
	    
	}
}
// Scratch
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
class Main{
    static Node root;
    Main(int data){
        root=new Node(data);
    }
    Main(){
        root=null;
    }
    public static void main(String args[]) throws Exception{
        
        Main obj=new Main();
        obj.root=new Node(100);
        obj.root.left=new Node(7);
        obj.root.right=new Node(10);
        
        obj.root.left.left=new Node(6);
        obj.root.left.right=new Node(11);
        
        obj.root.right.left=new Node(4);
        obj.root.right.right=new Node(3);
        
        obj.root.right.right.left=new Node(2);
        obj.root.right.right.right=new Node(1);
        
        obj.root.right.right.left.left=new Node(8);
        obj.root.right.right.left.right=new Node(5);
        
        int n1=1;
        int n2=8;
        
        System.out.println(lcs(root,n1,n2).data);
   
    }
    public static Node lcs(Node root, int n1, int n2){
        if(root==null)
            return null;
        if(root.data==n1|| root.data==n2)
            return root;
        Node l=lcs(root.left, n1, n2);
        Node r=lcs(root.right, n1,n2);
        
        if(l!=null && r!=null)
            return root;
        
        else if(l==null)
            return r;
        else
            return l;
 
        
    }
}
