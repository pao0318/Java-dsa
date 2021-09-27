import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {

        if(node==null || node.next==null)
            return node;
        LLNode fast=node;
        LLNode mid=node;
        LLNode prev=null;

        while(fast!=null&&fast.next!=null){
            prev=mid;
            mid=mid.next;
            fast=fast.next.next;
        }
        prev.next=null;
        
        LLNode right=reverse(mid);
        LLNode left=node;

        LLNode res=new LLNode(0);
        LLNode temp=res;
        int i=0;
        while(right!=null && left!=null){
            if(i%2==0){
                temp.next=right;
                right=right.next;
            }
            else{
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
            i++;
        }
        if(right!=null)
            temp.next=right;
        
        if(left!=null)
            temp.next=left;

        return res.next;    



    }
    public LLNode reverse(LLNode node){
        LLNode prev=null;
        LLNode curr=node;
        LLNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
}
