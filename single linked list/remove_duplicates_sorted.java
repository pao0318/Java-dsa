class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	Node prev=head;
	Node next=head.next;
	while(next!=null){
	    if(prev.data==next.data){
	        prev.next=next.next;
	        next=prev.next;
	    }
	    else{
	        prev=next;
	        next=next.next;
	    }
	}
	return head;
    }
}
