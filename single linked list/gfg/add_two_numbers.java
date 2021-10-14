//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1# 
class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
       Node new_first=reverse(first);
       Node new_second=reverse(second);
        
        Node res=new Node(0);
        Node ptr=res;
        int sum=0;
        int carry=0;
        while(new_first!=null || new_second!=null){
            if(new_first!=null){
                sum+=new_first.data;
                new_first=new_first.next;
            }
            if(new_second!=null){
                sum+=new_second.data;
                new_second=new_second.next;
            }
            sum+=carry;
            res.next=new Node(sum%10);
            res=res.next;
            carry=sum/10;
            sum=0;
            
        }  
        if(carry>0){
            res.next=new Node(carry);
        }
        
        Node final_ans=reverse(ptr.next);
        return final_ans;
        
        
    }
    
      static Node reverse(Node head)
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
