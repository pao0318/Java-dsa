// https://leetcode.com/problems/combination-sum-iii/submissions/
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>res=new ArrayList<>();
        combinations(1,n,k,new LinkedList(),res);
        return res;
        
    }
public void combinations(int start, int n, int k, LinkedList l1, List<List<Integer>>res){
    if(k<0||n<0)
        return;
    if(k==0 && n==0){
        res.add(new ArrayList(l1));
        return;
    }
    
    for(int i=start;i<=9;i++){
        l1.add(i);
        combinations(i+1, n-i, k-1,l1,res);
        l1.removeLast();
    }
        
}
}
