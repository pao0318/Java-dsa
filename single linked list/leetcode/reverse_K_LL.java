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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null||k==1)
            return head;
      ListNode dummy=new ListNode(-1);
      dummy.next=head;
        ListNode curr = dummy, next = dummy, prev = dummy; 
        int size=0;
        ListNode temp1=head;
        while(temp1.next!=null){
            temp1=temp1.next;
            size++;
        }
  
        while(size>=k){
            curr=prev.next;
             next=curr.next;
            for(int i=0;i<k-1;i++){
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            size-=k;
        }
   
            return dummy.next;
        }
}
    
    

 
