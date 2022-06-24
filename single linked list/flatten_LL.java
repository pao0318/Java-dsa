import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
	public static Node flattenLinkedList(Node start) {
		
        if(start==null || start.next==null)
            return start;
        
        start.next=flattenLinkedList(start.next);
        
        start=merge(start,start.next);
        return start;
        
	}
    
    public static Node merge(Node a, Node b){
        
        Node temp= new Node(-1);
        Node res=temp;
        
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.child=a;
                temp=temp.child;
                a=a.child;
            }
            else{
                temp.child=b;
                temp=temp.child;
                b=b.child;
            }
        }
        if(a!=null)
            temp.child=a;
        else
            temp.child=b;
        return res.child;

    }
}

