// https://practice.geeksforgeeks.org/problems/symmetric-tree/1
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        return helper(root,root);
    }
    public static boolean helper(Node root1, Node root2){
        if(root1==null && root2==null)
            return true;
        
        if(root1!=null && root2!=null && root1.data==root2.data)
            return helper(root1.right,root2.left) && helper(root1.left, root2.right);
        return false;
    }
}
