// https://leetcode.com/problems/combinations/
class Solution {
    
public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        combination(result,new ArrayList<>(),1,n,k);
        return result;
    }
    private void combination(List<List<Integer>> result,ArrayList<Integer> comb,int start,int n,int k)
    {
        if(k==0)
        {
            result.add(new ArrayList(comb));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            comb.add(i);
            combination(result,comb,i+1,n,k-1);
            comb.remove(comb.size()-1);
        }
    }
}
