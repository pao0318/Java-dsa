// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        if(root==null)
            return null;
            
       ArrayList<Integer>list=new ArrayList<>();
       
       Queue<Pair> pq=new LinkedList<Pair>();
       TreeMap<Integer,Integer> map=new TreeMap<>();
       
       pq.add(new Pair(root,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            Node curr=p.node;
            int dist=p.hd;
            
            map.put(dist,curr.data);
    
            if(curr.left!=null)
                pq.add(new Pair(curr.left,dist-1));
                
                
            if(curr.right!=null)
                pq.add(new Pair(curr.right,dist+1));

        }
        for(Map.Entry<Integer,Integer>x:map.entrySet())
            list.add(x.getValue());
            return list;
        
       
    }
}
class Pair{
    Node node;
    int hd;
    public Pair(Node temp,int d){
        this.node=temp;
        this.hd=d;
    }
}
