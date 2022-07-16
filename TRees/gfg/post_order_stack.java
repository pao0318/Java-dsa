import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.data=key;
        left=right=null;
    }
}
class Main{
    public static void postorder(Node root){
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        
        stack.push(node);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            res.add(temp.data);
            
            if(temp.left!=null)
                stack.push(temp.left);
            if(temp.right!=null)
                stack.push(temp.right);
                
        }
        while(!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
    
    

    
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        postorder(root);
    }
    
    
    
}

// Or
// https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
     
        while(!stack.isEmpty()||root!=null){
            if(root!=null){
                stack.add(root);
                root=root.left;
            }
            else{
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    res.add(temp.val);
                    
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        res.add(temp.val);
                    }
                }
                else
                    root=temp;
            }
        }
        return res;
            
    }
}
