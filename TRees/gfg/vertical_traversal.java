// lEETCODE
// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map= new TreeMap<>();
        
        Queue<Pair> pq= new LinkedList<>();
        pq.add(new Pair(root,0,0));
        while(!pq.isEmpty()){
            Pair it=pq.poll();
            TreeNode node=it.node;
            int x=it.row;
            int y=it.col;
            
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).add(node.val);
            if(node.left!=null){
                pq.offer(new Pair(node.left,x-1,y+1));
            }
            if(node.right!=null){
                pq.offer(new Pair(node.right,x+1,y+1));
            }
        }
        
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> node: ys.values()){
                while(!node.isEmpty()){
                    res.get(res.size()-1).add(node.poll());
                }
            }
        }
        return res;
        
        
        
        
    }
}

class Pair{
    TreeNode node;
    int row;
    int col;
    Pair(TreeNode node, int row, int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
}




// GFG

// https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1#// 
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
