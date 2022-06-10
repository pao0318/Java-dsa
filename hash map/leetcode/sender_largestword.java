class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<messages.length;i++){
            String[] arr= messages[i].split(" ");
            int len=arr.length;
            map.put(senders[i],map.getOrDefault(senders[i],0)+len);
        }
        String res="";
        for(Map.Entry<String,Integer> x: map.entrySet()){
            if(max<x.getValue()){
                max=x.getValue();
                res=x.getKey();
            }
            else if(max==x.getValue()){
                if(res.compareTo(x.getKey())<0)
                    res=x.getKey();
            }
        }
           return res;
        
    }
}
