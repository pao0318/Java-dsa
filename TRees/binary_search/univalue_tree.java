// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd

import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public boolean solve(Tree root) {
        if(root==null)
            return true;
        if(list.isEmpty())
            list.add(root.val);
        if(!list.contains(root.val)) 
            return false;   
        int val=root.val;
        return solve(root.left) && solve(root.right);
    }


}
