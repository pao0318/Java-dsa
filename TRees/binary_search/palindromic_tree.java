//https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd 
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root){
        List<Integer> list=new ArrayList<>();
        helper(root,list);
       
        int left = 0;
        int right = list.size() - 1;

        while (left < right){
            if (list.get(left++) != list.get(right--))
                return false;
        }

        return true;
    }
       
    private void helper(Tree root, List<Integer> list){
        if(root==null)
            return;
        if(root.left!=null)
            helper(root.left,list);

        list.add(root.val);

        if(root.right!=null)
        helper(root.right,list);
        

    }
}
