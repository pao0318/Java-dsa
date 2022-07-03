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
    
    
// or in array size of k
import java.util.* ;
import java.io.*; 


public class Solution {
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
	    if(head==null)
            return head;
        return helper(head,n,b,0);
        
	}
    
    public static Node helper(Node head, int n, int[]b,int idx){
        if(head==null || idx>=n)
            return head;
        
        int k=b[idx];
        int cnt=0;
        
        if (k == 0) {
            return helper(head, n, b, idx + 1);
        }
        Node curr=head;
        Node next=null;
        Node prev=null;
        while(curr!=null && cnt<k){
            next=curr.next;
            curr.next=prev;
            cnt++;
            prev=curr;
            curr=next;
        }
        head.next=helper(next,n,b,idx+1);
        return prev;

        
    }
}
 
