// https://leetcode.com/problems/last-stone-weight/
class Solution{ 
public int lastStoneWeight(int[] stones) {
        int result = 0;
        ArrayList<Integer> stoneList = new ArrayList<Integer>();
        for(int i=0;i<stones.length;i++)
            stoneList.add(stones[i]);
        
          if(stoneList.size()==1)
          return stoneList.get(0);
        
        
        while(stoneList.size()>1){
             Collections.sort(stoneList,Collections.reverseOrder());
	            result = stoneList.get(0) - stoneList.get(1);
		        stoneList.remove(stoneList.get(0));
		        stoneList.remove(stoneList.get(0));
                stoneList.add(result);
        }
        return result;
    
}
}
