// https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
class Solution
{
    int value;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        
        helper(root,K);
        return value;
    }
    
    public int helper(Node root, int K){
        
        if(root==null)
            return K;
        
        int nk=helper(root.right,K);
        nk--;
        
        if(nk==0){
            value=root.data;
            return -1;
        }
        else if(nk<0)
            return -1;
        
        return helper(root.left,nk);
    }
}
