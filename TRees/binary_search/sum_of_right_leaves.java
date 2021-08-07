// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd

class Solution {
    public int solve(Tree root) {
        if (root == null)
            return 0;
        if (root.right != null && isLeaf(root.right))
            return root.right.val + solve(root.left);
        return solve(root.right) + solve(root.left);
    }
    public boolean isLeaf(Tree root) {
        if (root.left == null && root.right == null)
            return true;
        return false;
    }
}
