import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode l0, LLNode l1) {
        LLNode temp=new LLNode(0);
        LLNode curr=temp;
        int carry=0;

        while(l0!=null || l1!=null || carry==1){
            int sum=0;
            if(l0!=null){
                sum+=l0.val;
                l0=l0.next;
            }
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            sum+=carry;
            carry=sum/10;
            LLNode node=new LLNode(sum%10);
            curr.next=node;
            curr=curr.next;
        }
        return temp.next;
    }
}
