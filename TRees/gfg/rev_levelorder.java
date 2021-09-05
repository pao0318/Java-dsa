
// https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1#
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/


class Tree
{
   
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
       ArrayList<Integer> list=new ArrayList<>();
       Queue<Node> pq=new LinkedList<>();
       pq.add(node);
       while(!pq.isEmpty()){
           Node temp=pq.poll();
           list.add(temp.data);
           if(temp.right!=null)
                pq.add(temp.right);
            if(temp.left!=null)
                pq.add(temp.left);
            
       }
       Collections.reverse(list);
       return list;
    }
        
} 
