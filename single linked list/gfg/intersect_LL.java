// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1#
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         int len1=0;
         int len2=0;
         Node ptr1=head1, ptr2=head2;
         
         while(ptr1!=null){
             len1++;
             ptr1=ptr1.next;
         }
         while(ptr2!=null){
             len2++;
             ptr2=ptr2.next;
         }
         int len=Math.abs(len1-len2);
         Node temp1=head1, temp2=head2;
        if(len1>len2){
            for(int i=0;i<len;i++)
                temp1=temp1.next;
        }
        else{
            for(int i=0;i<len;i++)
                temp2=temp2.next;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1.data;
         
	}
	
}
// oR
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        
        int size1=0;
        int size2=0;
        
        while(temp1!=null){
            temp1=temp1.next;
            size1++;
        }
         while(temp2!=null){
            temp2=temp2.next;
            size2++;
        }
        
        int diff=Math.abs(size1-size2);
      
        
        if(size1>size2){
            while(diff-->0)
                headA=headA.next;
        }
        else{
            while(diff-->0)
                headB=headB.next;
        }
        
        
        while(headA!=null && headB!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;

     
    }
}
