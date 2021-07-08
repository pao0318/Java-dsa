class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
       if(nums.length==0||nums==null)
            return new int[0];

        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
             
            map.put(nums[i],i);
                    
        }
        return new int[0];
    }
        
        
        
    }
