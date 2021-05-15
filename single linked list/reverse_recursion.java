/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    ListNode head;
    public ListNode reverseList(ListNode A) {
        // ListNode head;
        if(A.next==null){
            head=A;
            return head;
        }
        reverseList(A.next);
        ListNode b=A.next;
        b.next=A;
        A.next=null;
        
        return head;
            
    }
}
