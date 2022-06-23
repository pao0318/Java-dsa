class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode secA=head;
        ListNode mid=getmid(head);
        ListNode secB=reverse(mid);
        
        while(secB!=null){
            if(secA.val!=secB.val)
                return false;
            secA=secA.next;
            secB=secB.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head==null)
            return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)
                next=next.next;
        }
        return prev;
    }

    public ListNode getmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

// OR
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list= new ArrayList<>();
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            list.add(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null && fast.next==null){
            list.add(slow.val);
        }
        
        Collections.reverse(list);
        int i=0;
        while(slow!=null){
            if(slow.val!=list.get(i))
                return false;
            slow=slow.next;
            i++;
        }
        return true;
    }
}
