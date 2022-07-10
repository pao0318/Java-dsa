// https://www.codingninjas.com/codestudio/problems/span-of-ninja-coin_1475049?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
import java.util.ArrayList;
import java.util.Stack;


class Pair{
    int key;
    int val;
    Pair(int key, int val){
        this.key=key;
        this.val=val;
    }
}
public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
       ArrayList<Integer> res= new ArrayList<>();
       Stack<Pair> stack= new Stack();
        int span=1;
        for(int i=0;i<price.size();i++){
            span=1;
            while(!stack.isEmpty() && price.get(i)>=stack.peek().key){
                span+=stack.peek().val;
                stack.pop();
            }
       
            stack.push(new Pair(price.get(i),span));
            res.add(stack.peek().val);
 
        }
        
        return res;
    }
}
