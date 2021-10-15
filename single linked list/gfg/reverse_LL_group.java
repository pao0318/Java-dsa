// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1#
class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node curr=node, next=node, prev=null;
        int len=0;
        while(curr!=null && len<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            len++;
        }
        if(next!=null){
            Node res=reverse(next,k);
            node.next=res;
        }
        return prev;
    }
}
