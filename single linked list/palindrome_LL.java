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
