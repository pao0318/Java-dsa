// https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        if(rowIndex==0)
            return list;
        
        
        List<Integer>list1=getRow(rowIndex-1);
 
        for(int i=0;i<list1.size()-1;i++){
            int sum=list1.get(i)+list1.get(i+1);
            list.add(sum);
        }
        list.add(1);
        return list;
        
    }
}
