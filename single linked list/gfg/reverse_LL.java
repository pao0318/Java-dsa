// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1 
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node prev=null;
        Node curr =head;
        Node next=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        
    }
}
