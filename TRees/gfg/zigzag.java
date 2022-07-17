// https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
    
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> list=new ArrayList<>();
	    Queue<Node> pq=new LinkedList<>();
	    pq.add(root);
	    boolean flag=false;
	    while(!pq.isEmpty()){
	           ArrayList<Integer> res=new ArrayList<>();
	        int n=pq.size();
	        while(n-->0){
	            Node temp=pq.poll();
	            res.add(temp.data);
	          
	            if(temp.left!=null)
	            pq.add(temp.left); 
	             if(temp.right!=null)
	            pq.add(temp.right);
	            
	        }
	        if(flag)
	            Collections.reverse(res);
	       for(int i:res)
	        list.add(i);
	        flag=!flag;
	  
	    }
	    return list;
	    
	}
}

// Leetcode 
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        Queue<Pair> pq= new LinkedList<>();
        pq.add(new Pair(root,0));
        
        boolean flag=false;
        while(!pq.isEmpty()){
            int size=pq.size();
            int level=pq.peek().level;
            List<Integer> list= new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Pair it=pq.poll();
                TreeNode temp=it.node;
                
                if(temp.left!=null)
                    pq.offer(new Pair(temp.left,level+1));
                if(temp.right!=null)
                    pq.offer(new Pair(temp.right,level+1));
                 list.add(temp.val);
            }
            if(flag)
                Collections.reverse(list);
            flag=!flag;
            res.add(list);
           
        }
        return res;
        
    }
}
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level){
        this.node=node;
        this.level=level;
    }
}
