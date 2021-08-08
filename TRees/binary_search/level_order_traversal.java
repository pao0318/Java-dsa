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
    public int[] solve(Tree root) {
        ArrayList <Integer> list=new ArrayList<>();
        Queue<Tree> pq=new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            Tree node=pq.poll();
            list.add(node.val);
            if(node.left!=null)
                pq.add(node.left);
            if(node.right!=null)
                pq.add(node.right);    
        }
        int[]res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
