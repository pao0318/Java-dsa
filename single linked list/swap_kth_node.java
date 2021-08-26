// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
class Solution {
    public LLNode solve(LLNode node, int k) {
        LLNode slow=node;
        LLNode fast=node;
        if(node==null)
            return null;
        while(k>0){
            fast=fast.next;
            k--;
        }
        LLNode pehla=fast;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp=pehla.val;
        pehla.val=slow.val;
        slow.val=temp;
        return node;
        


    }
