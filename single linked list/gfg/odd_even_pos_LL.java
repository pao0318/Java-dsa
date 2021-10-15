// https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1#
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          int i=1;
          if(head==null || head.next==null)
                return;
        Node t1=head;
        Node h1=head;
        Node h2=head.next;
        Node t2=head.next;
        
        while(t2!=null && t1.next.next!=null){
            t1.next=t1.next.next;
            t1=t1.next;
            t2.next=t2.next.next;
            t2=t2.next;
        }
        if(t2==null){
            t1.next=h2;
            return;
        }
        else{
            
            t1.next=h2;
            t2.next=null;
            
            return;
        }
          
          
          
     }
}
