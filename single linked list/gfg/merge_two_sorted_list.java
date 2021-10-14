// 
class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        Node ptr=head1;
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        
     if(head1.data<=head2.data){
         head1.next=sortedMerge(head1.next, head2);
        
     }
        
    else if(head2.data<head1.data){
       
        head1.next=sortedMerge(head1, head2.next);
    }
    return ptr;
        
   } 
}
// or
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<Integer> list=new ArrayList<>();
        while(l1!=null && l2!=null){
            list.add(l1.val);
            list.add(l2.val);
            l1=l1.next;
            l2=l2.next;
            
        }
        while(l2!=null){
            list.add(l2.val);
            l2=l2.next;
            
    }
       while(l1!=null){
            list.add(l1.val);
            l1=l1.next;
        
    }
        Collections.sort(list);
        
        ListNode res=new ListNode(0);
        ListNode temp=res;
        for(int i=0;i<list.size();i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return res.next;

        
    }
}
