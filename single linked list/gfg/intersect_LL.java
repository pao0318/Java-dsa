// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1#
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         int len1=0;
         int len2=0;
         Node ptr1=head1, ptr2=head2;
         
         while(ptr1!=null){
             len1++;
             ptr1=ptr1.next;
         }
         while(ptr2!=null){
             len2++;
             ptr2=ptr2.next;
         }
         int len=Math.abs(len1-len2);
         Node temp1=head1, temp2=head2;
        if(len1>len2){
            for(int i=0;i<len;i++)
                temp1=temp1.next;
        }
        else{
            for(int i=0;i<len;i++)
                temp2=temp2.next;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1.data;
         
	}
	
}
