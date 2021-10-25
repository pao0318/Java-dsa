https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1#// 
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
       ArrayList<Integer> res=new ArrayList<>();
       TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
       Queue<Pair> pq=new LinkedList<>();
       pq.add(new Pair(root,0));
       while(!pq.isEmpty()){
           Pair p=pq.poll();
           Node temp=p.x;
           int pos=p.y;
           if(!map.containsKey(pos)){
                map.put(pos, new ArrayList<>());
           }
            
            map.get(pos).add(temp.data);
           if(temp.left!=null)
                pq.add(new Pair(temp.left, pos-1));
            if(temp.right!=null)
                pq.add(new Pair(temp.right, pos+1));
                
       }
       for(ArrayList<Integer> i:map.values()){
           res.addAll(i);
       }
       return res;
       
       
    }
    private static class Pair{
        Node x;
        int y;
        Pair(Node x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
