import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=helper(list,root,k);
        for(int i=0;i<k;i++){
            list.remove(0);

        }
        return list.get(0);
    }
    public ArrayList<Integer> helper(ArrayList<Integer> list, Tree root, int k){
        if(root==null){
            list=new ArrayList<>(0);
            return list;
    }
    if(root.left!=null)
        helper(list,root.left,k);
    
    list.add(root.val);

    if(root.right!=null)
        helper(list,root.right,k);
    
    return list;
     
     
    }
}
//  or
class Solution {
    int r = -1;
    public int solve(Tree root, int k) {
        Tree res = preOrder(root, k);
        return res.val;
    }

    public Tree preOrder(Tree root, int k) {
        if (root == null)
            return null;

        Tree left = preOrder(root.left, k);
        if (left != null)
            return left;
        r++;
        if (r == k)
            return root;
        return preOrder(root.right, k);
    }
}
