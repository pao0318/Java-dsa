https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1#// 
class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node merge(Node left, Node right){
        Node res=null;
        if(left==null)
            return right;
            
        if(right==null)
            return left;
            
        if(left.data<=right.data){
            res=left;
            res.next=merge(left.next, right);
        }    
        else{
            res=right;
            res.next=merge(left,right.next);
        }
        return res;
    }
    
    
    
    static Node mergeSort(Node head)
    {
        if(head.next==null)
            return head;
            
        Node mid=findMid(head);
        Node sec=mid.next;
        mid.next=null;
        
        Node a=mergeSort(head);
        Node b=mergeSort(sec);
        Node ans= merge(a, b);
        return ans;
    }
    
    
    static Node findMid(Node head){
        if(head==null)
            return head;
        Node slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
