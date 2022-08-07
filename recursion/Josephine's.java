// https://practice.geeksforgeeks.org/problems/josephus-problem/1
class Solution
{
   public int josephus(int n, int k)
    {
       List<Integer> list= new ArrayList<>();
       for(int i=1;i<=n;i++)
        list.add(i);
        
        helper(list,k,0);
        return list.get(0);
    }
    
    void helper(List<Integer> list, int k, int idx){
        if(list.size()==1)
            return;
        
        k--;
        int i=(idx+k)%list.size();
        list.remove(i);
        
        helper(list,k+1,i);
    }

}

