// https://www.geeksforgeeks.org/maximum-trains-stoppage-can-provided/
class Solution {
    public LLNode merge(LLNode node1, LLNode node2) {
        LLNode curr = new LLNode();
        LLNode head = curr;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                head.next = node1;
                node1 = node1.next;
            } else {
                head.next = node2;
                node2 = node2.next;
            }
            head = head.next;
        }
        if (node1 == null && node2 != null) {
            while (node2 != null) {
                head.next = node2;
                node2 = node2.next;
                head = head.next;
            }
        }
        if (node2 == null && node1 != null) {
            while (node1 != null) {
                head.next = node1;
                node1 = node1.next;
                head = head.next;
            }
        }
        return curr.next;
    }
    public LLNode middle(LLNode head) {
        LLNode slow = head;
        LLNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public LLNode solve(LLNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        LLNode mid = middle(node);
        LLNode sec = mid.next;
        mid.next = null;

        LLNode left = solve(node);
        LLNode right = solve(sec);
        LLNode mergeSort = merge(left, right);
        return mergeSort;
    }
}
