class Solution {
    // Function to return the diameter of a Binary Tree.
    int res=0;
    int diameter(Node root) {
        helper(root);
        return res;
    }
    int helper(Node root){
        if(root==null)
            return 0;
        
        int l=helper(root.left);
        int r=helper(root.right);
        res=Math.max(res,l+r+1);
        
        return 1+Math.max(l,r);
        
        
    }
}
// Scratch tree
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class Main{
    static Node buildTree(String str){
        if(str.length()==0||str.charAt(0)=='N')
            return null;
        
        String[]ip=str.split(" ");
        Node root=new Node (Integer.parseInt(ip[0]));
        
        Queue<Node> pq=new LinkedList<>();
        pq.add(root);
        
        int i=1;
        while(pq.size()>1 &&i<ip.length){
            // Get and remove the front of the Queue
            Node currNode=pq.poll();
            
            // Get current Nodes values
            String currVal=ip[i];
            
            // If left child is not null
            if(!currVal.equals("N")){
            currNode.left=new Node(Integer.parseInt(currVal));
            pq.add(currNode.left);
            }
            // For right child
            i++;
            if(i>=ip.length)
                break;
                
            // If right child is not null
            if(!currVal.equals("N")){
            currNode.left=new Node(Integer.parseInt(currVal));
            pq.add(currNode.left);
            }  
            i++;
        }
        return root;
        
    }
   static class Solution {
    // Function to return the diameter of a Binary Tree.
    int res=0;
     int diameter(Node root) {
        helper(root);
        return res;
    }
    int helper(Node root){
        if(root==null)
            return 0;
        
        int l=helper(root.left);
        int r=helper(root.right);
        res=Math.max(res,l+r+1);
        
        return 1+Math.max(l,r);
        
        
    }
}
    

    
     public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            String s = sc.nextLine();
            Node root = buildTree(s);
            Solution g = new Solution();
            System.out.println(g.diameter(root));
            t--;
        }
    }
}
