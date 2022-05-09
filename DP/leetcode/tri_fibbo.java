// https://leetcode.com/problems/n-th-tribonacci-number/submissions/
class Solution {
    Map<Integer,Integer>map= new HashMap<>();
    public int tribonacci(int n) {
    if(n==0)
        return 0;
    if(n==1||n==2)
        return 1;
    int res;
        if(map.containsKey(n))
            return map.get(n);
        else
            res=tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
        map.put(n,res);
        return map.get(n);
    }

}
