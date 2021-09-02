import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    int ans=0;
    public int solve(Tree root) {
        helper(root);
        return ans;
    }

    int helper(Tree root){
        if(root==null) return 0;

        int left=helper(root.left);
        int right=helper(root.right);

        if(root.left!=null && root.right!=null){
            if((left%2)+(right%2)==1)
                ans++;
        }  
        return root.val+left+right;

    }
}



// Yeh v theek h



import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
        int[] count = {0};
        helper(root, count);

        return count[0];
    }

    public Tree helper(Tree node, int[] count) {
        if (node == null) {
            return null;
        }

        Tree left = helper(node.left, count);
        Tree right = helper(node.right, count);

        if (left != null && right != null) {
            if ((left.val % 2 == 0 && right.val % 2 == 1)
                || (left.val % 2 == 1 && right.val % 2 == 0)) {
                count[0]++;
            }
        }

        Tree sum = new Tree(node.val);
        if (left != null) {
            sum.val += left.val;
        }
        if (right != null) {
            sum.val += right.val;
        }

        return sum;
    }
}
