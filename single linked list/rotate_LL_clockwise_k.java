import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        if(head==null || head.next==null||k==0 )
            return head;
         
        Node end=head;
        Node mid=head;
        Node prev=null;
        int len=1;
        while(end.next!=null){
            end=end.next;
            len++;
        }
        
        if(k==len)
            return head;
        
        k=k%len;
      
        int left=len-k;
        while(left-->0){
            prev=mid;
            mid=mid.next;
        }
        prev.next=null;
        
       end.next=head;
  
return mid;
    }
}
