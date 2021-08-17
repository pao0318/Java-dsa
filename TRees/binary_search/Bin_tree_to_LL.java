// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(Tree root) {
        LLNode head = new LLNode(root.val);
        LLNode curr = head;
        Queue<Tree> pq = new LinkedList<>();
        pq.offer(root);
        while (!pq.isEmpty()) {
            Tree node = pq.poll();
            if (node.left != null) {
                pq.offer(node.left);
                curr.next = new LLNode(node.left.val);
                curr = curr.next;
            }
            if (node.right != null) {
                pq.offer(node.right);
                curr.next = new LLNode(node.right.val);
                curr = curr.next;
            }
        }
        return head;
    }
}
