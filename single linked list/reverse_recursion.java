class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode curr=reverseList(head.next);
        ListNode newhead=head.next;
        newhead.next=head;
        head.next=null;
        
        return curr;
        
        
    }
}
