class Pair{
    Node node;
    int hd;
    Pair(Node temp, int d){
        node=temp;
        hd=d;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair>pq=new LinkedList<Pair>();
        
        pq.add(new Pair(root,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            Node curr=p.node;
            int point=p.hd;
            if(!map.containsKey(point))
                map.put(point,curr.data);
            if(curr.left!=null)  
                pq.add(new Pair(curr.left,point-1));
            if(curr.right!=null)
                pq.add(new Pair(curr.right,point+1));
        }
        for(Map.Entry<Integer,Integer>x:map.entrySet())
            list.add(x.getValue());
            
        return list;    
          
         
    }
}
