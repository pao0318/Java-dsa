// https://www.codingninjas.com/codestudio/problems/893103?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1


class NewNode{
    int min,max,maxSize;
    NewNode(int minNode, int maxNode, int maxSize){
        this.min=minNode;
        this.max=maxNode;
        this.maxSize=maxSize;
    }
}
public class Solution {
    public static NewNode findLargest (TreeNode<Integer> root){
        if(root==null)
            return new NewNode(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        
        NewNode left=findLargest(root.left);
        NewNode right=findLargest(root.right);
        
//         Its a BST
        if(left.max<root.data && right.min>root.data){
            return new NewNode(Math.min(root.data,left.min),Math.max(root.data,right.max),left.maxSize+right.maxSize+1);
        }
//         Return incomparable tree
        return new NewNode(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.maxSize,right.maxSize));
        
        
    }
	public static int largestBST(TreeNode<Integer> root) {
		
        return findLargest(root).maxSize;
	}
}
