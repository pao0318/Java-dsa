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
        if (root == null) {
            int[] test = new int[0];
            return test;
        }
        ArrayList<Integer> treeArr = new ArrayList<Integer>();
        helper(root, treeArr);
        int[] returnedArray = new int[treeArr.size()];
        for (int i = 0; i < treeArr.size(); i++) {
            returnedArray[i] = treeArr.get(i);
        }
        return returnedArray;
    }

    public ArrayList<Integer> helper(Tree root, ArrayList<Integer> treeArr) {
        if (root.left != null) {
            helper(root.left, treeArr);
        }
        treeArr.add(root.val);
        if (root.right != null) {
            helper(root.right, treeArr);
        }
        return treeArr;
    }
}
