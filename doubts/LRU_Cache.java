// https://leetcode.com/problems/lru-cache/
class Pair{
    int k;
    int freq;
    Pair(int k, int freq){
        this.k=k;
        this.freq=freq;
    }
}

class LRUCache {
    int size;
    static PriorityQueue<Pair> pq;
    PriorityQueue<Pair> temp;
    static Map<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.size=capacity;
        this.pq=new PriorityQueue<Pair>((a,b)->a.freq-b.freq);
        this.temp=new PriorityQueue<Pair>((a,b)->a.freq-b.freq);
        this.map= new HashMap<>();
    }
    
    public int get(int key) {
        temp.clear();
        while(!pq.isEmpty()){
            int x=pq.peek().k;
            if(x==key)
                return key;
            temp.add(pq.poll());
        }
        pq=temp;
        return -1;
    }
    
    public void put(int key, int value) {
        while(pq.size()>=size){
            map.remove(pq.peek().k);
            pq.poll();
            
        }
       
        map.put(key,value);
        pq.add(new Pair(key,map.get(key)));
        System.out.print(pq.peek().k+" ");
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
