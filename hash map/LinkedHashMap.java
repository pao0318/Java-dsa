import java.util.*;

class LRUCache{
    Set<Integer> cache;
    int capacity;
    
    public LRUCache(int capacity){
        this.cache=new LinkedHashSet<Integer>(capacity);
        this.capacity=capacity;
    }
    // false if key is not present 
    // else moves the key to front by removing it and adding it and returns true

    public boolean get(int key){
        if(!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;   
    }
    // Refer key x within the LRU Cache
    public void refer(int key){
        if(get(key)==false)
            put(key);
    }
    public void display(){
        LinkedList<Integer> list=new LinkedList<>(cache);
        // The descendingIterator() method of java.util.LinkedList
      // class is used to return an iterator over the elements
      // in this LinkedList in reverse sequential order
      Iterator<Integer> list= new list.descendingIterator();
      while(itr.hasNext())
        System.out.println(itr.next()+ " ");
    }
    public void put(int key){
        if (cache.size()==capacity){
            int firstKey=cache.iterator().next();
            cache.remove(firstKey);
        }
        cache.add(key);
    }
    public static void main(String args[]){
        LRUCache ca=new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
}
