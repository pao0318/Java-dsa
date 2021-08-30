class Solution {
    public Tree solve(Tree tree, int target) {
        LinkedList<Tree> q = new LinkedList();
        q.addLast(tree);

        while (q.size() > 0) {
            int size = q.size();
            Tree prev = null;
            for (int i = 0; i < size; i++) {
                Tree cur = q.removeFirst();
                if (prev != null && prev.val == target)
                    return cur;
                prev = cur;

                if (cur.left != null)
                    q.addLast(cur.left);
                if (cur.right != null)
                    q.addLast(cur.right);
            }
        }
        return null;
    }
}
