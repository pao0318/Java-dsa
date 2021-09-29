import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0){
	       int n=sc.nextInt();
	       int bite=sc.nextInt();
	       int[]nums=new int[n];
	       for(int k=1;k<=n;k++){
	           nums[k-1]=k;
	       }
	       List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        backtrack(res, visited, nums, new ArrayList<>());
       
       int ans=0;
       for(int idx=0;idx<res.size();idx++){
           int len=res.get(idx).size();
           for(int pos=0;pos<len;pos++){
               if(res.get(idx).pos==pos+1)
                   ans++;
               
           }
           if(ans==bite){
               break;
           }
       }
       
       
       
        
    }
	}
	       
	    private static void backtrack(List<List<Integer>> res, boolean[] visited, int[] nums, List<Integer> list) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<nums.length; i++) {
            if(visited[i])
                continue;
            visited[i] = true;
            list.add(nums[i]);
            backtrack(res, visited, nums, list);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
