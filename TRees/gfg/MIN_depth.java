// https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1#
//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    
	int minDepth(Node root)
	{
	    if(root==null)
	        return 0;
	  if(root.left==null && root.right==null)
	        return 1;
	        int l=Integer.MAX_VALUE, r=Integer.MAX_VALUE;
	   if(root.left!=null)
	   l=minDepth(root.left);
	    if(root.right!=null)
	    r=minDepth(root.right);
	    
	    return 1+Math.min(l,r);
	}

}
