// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1#
class Solution
{
    public static Node reverse(Node node, int k)
    {
    Node prev=null;
    Node next;
    Node curr=node;
    int c=k;
    while(c-->0&&curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    if(node!=null)
        node.next=reverse(curr,k);
    return prev;    

}
}
