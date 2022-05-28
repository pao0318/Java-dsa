class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode curr=reverseList(head.next);
        ListNode newhead=head.next;
        newhead.next=head;
        head.next=null;
        
        return curr;
        
        
    }
}

// or
import java.util.*;

 class Node{
	    int data;
	    Node next;
	    Node(int data){
	        this.data=data;
	        next=null;
	    }
	}

public class Main
{
    static Node head;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Main list = new Main();
		list.head= new Node(1);
		list.head.next= new Node(2);
		list.head.next.next= new Node(3);
		list.head.next.next.next= new Node(4);
		list.head.next.next.next.next= new Node(5);
		
		
		head=list.reverse(head);
		list.printList(head);
	}
	
	public static Node reverse(Node head){
	  
	  if(head==null || head.next==null)
	    return head;
	    
	  Node res=reverse(head.next);
	  head.next.next=head;
	  
	  head.next=null;
	  
	  return res;
	  
	  
	}
	
	public static void printList(Node head){
	    while(head!=null){
	        System.out.println(head.data);
	        head=head.next;
	}
	

}
}
