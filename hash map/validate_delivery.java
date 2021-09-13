import java.util.*;

class Solution {
    public boolean solve(String[] orders) {
        HashMap<String,Integer> map=new HashMap<>();
      
        for(int i=0;i<orders.length;i++){
            if(map.containsKey(orders[i]))
                return false;
            
            if(orders[i].contains("P"))
                map.put(orders[i],0);
            else{
                String subs="P"+orders[i].substring(1,orders[i].length());
                if(map.containsKey(subs)&& map.get(subs)==0)
                    map.put(subs,1);
                else
                    return false;    
            }   
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==0)
                return false;
        }
        return true;
    }
}
