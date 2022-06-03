class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashMap<Integer,Integer> map2= new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        
        for(int k:A)
            map.put(k,map.getOrDefault(k,0)+1);
        
        for(int k:B){
            if(map.containsKey(k))
                map2.put(k,map2.getOrDefault(k,0)+1);
                
        }
        
        for(int k:C){

            if(map2.containsKey(k))
                list.add(k);
        }
        return list;
        
    }
}
