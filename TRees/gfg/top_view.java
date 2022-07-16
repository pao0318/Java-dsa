// https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1 
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node=node;
        this.level=level;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
         ArrayList<Integer> list= new ArrayList<>();
        
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair>pq= new LinkedList<>();
        
        pq.add(new Pair(root,0));
        
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            
            Node temp=p.node;
            int level=p.level;
            
            if(!map.containsKey(level))
                map.put(level,temp.data);
            
            if(temp.left!=null)
                pq.add(new Pair(temp.left,level+1));
            if(temp.right!=null)
                pq.add(new Pair(temp.right,level-1));  
            
        }
        
   for(Map.Entry<Integer,Integer> x: map.entrySet()){
       list.add(x.getValue());
   }
   Collections.reverse(list);
   
   return list;
    }
 
    
}
