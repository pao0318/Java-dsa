// https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            if(map.containsKey(i))
                map.put(i,map.getOrDefault(i,0)+1);
            else
                map.put(i,1);
            
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i])>=1){
                    list.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i])-1);
                }
            }
        }
        
        int[]arr=new int[list.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=list.get(i);
        
        return arr;
    }
}
// Second sorting technique

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                nums1[k++]=nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
