/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

            
    public class Solution {
    public ListNode solve(ListNode A) {
        ListNode iter = A;
        ListNode one = A;
        while(iter!=null){
            if(iter.val==0){
                iter.val = one.val;
                one.val = 0;
                one = one.next;
                iter = iter.next;
            }else{
                iter = iter.next;
            }
        }
        return A;
    }
}
     
  
