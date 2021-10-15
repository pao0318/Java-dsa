// https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1#
class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(k==0|| head==null|| head.next==null)
            return head;
        Node ptr1=head;
        int len=1;
        
        while(ptr1.next!=null){
            len++;
            ptr1=ptr1.next;
        }
        k=k%len;
        ptr1.next=head;
        
        while(k-->0){
            ptr1=ptr1.next;
        }
        head=ptr1.next;
        ptr1.next=null;
        
        return head;
        
    }
}
