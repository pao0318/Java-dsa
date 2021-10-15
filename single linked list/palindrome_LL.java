class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node slow=head, fast=head;
        Node mid=null;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            mid=slow;
            fast=fast.next.next;
        }
        
    
        Node left1=reverse(mid);
        
        Node ptr=head;
        while(left1!=null){
            if(left1.data!=ptr.data)
                return false;
            left1=left1.next;
            ptr=ptr.next;
        }
        return true;
        
        
    }   

    Node reverse(Node node){
        Node curr=node, next=node;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
