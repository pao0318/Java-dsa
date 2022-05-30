class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
      Node slow=head;
      Node fast=head;
      int flag=0;
     while (slow!= null && fast.next!=null &&fast.next.next!= null){
          slow=slow.next;
          fast=fast.next.next;
          if(slow==fast){
              flag=1;
              break;
          }
          
      }
      return (flag==1);
    }
