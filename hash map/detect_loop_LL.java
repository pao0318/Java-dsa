// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
       HashSet<Node> map = new HashSet<Node>();
       while(head!=null){
           if(map.contains(head))
            return true;
           map.add(head);
           head=head.next;
       }
       return false;
    }
}
