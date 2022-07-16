// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#

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
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> list= new ArrayList<>();
        
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair>pq= new LinkedList<>();
        
        pq.add(new Pair(root,0));
        while(!pq.isEmpty()){
   
            Pair p=pq.poll();
            Node temp=p.node;
            int val=p.level;
            map.put(val,temp.data);
           
           if(temp.left!=null)
                pq.add(new Pair(temp.left,val+1));
            if(temp.right!=null)
                pq.add(new Pair(temp.right,val-1));  
          
            
        }
        
        
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            list.add(x.getValue());
        }
        Collections.reverse(list);
        return list;

        
        
    }
}
