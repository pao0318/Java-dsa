// https://leetcode.com/problems/exclusive-time-of-functions/
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        Stack<int[]> innerCost = new Stack<>();
        
         for(String s : logs){
            String[] temp = s.split(":");
            int id = Integer.parseInt(temp[0]);
            int time = Integer.parseInt(temp[2]);
			
            if(temp[1].equals("start")){
                stack.push(time);
            }
             else{
                 int start=stack.pop();
                 int cost=time-start+1;
                 int fincost=cost;
                 
                 while(!innerCost.isEmpty() &&innerCost.peek()[1]>start)
                     fincost-=innerCost.pop()[0];
                 
                 innerCost.push(new int[]{cost,time});
                 ans[id]+=fincost;
             }
             
         }
        return ans;
    }
}
