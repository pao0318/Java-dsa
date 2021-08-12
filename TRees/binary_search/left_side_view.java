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
    List<Integer> list = new ArrayList<>();
    public int[] solve(Tree root) {
        
        List<Integer> ans=helper(root, 0); 
        // converts List<Integer> to int[] array
        int idx=0;
        int[]arr=new int[list.size()];
        for(int data:list){
            arr[idx]=data;
            idx++;
        }
        return arr;
    }

    private List<Integer> helper(Tree root, int level) {
        if (root != null) {
            if (list.size() == level)
                list.add(root.val);
            
            helper(root.left, level + 1);
            helper(root.right, level + 1);
        }
        return list;
    }
}
