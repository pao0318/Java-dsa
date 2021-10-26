// https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1
 /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        Queue<Node> pq=new LinkedList<>();
        pq.add(root);
        
        while(!pq.isEmpty()){
            int size=pq.size();
            for(int i=0;i<size;i++){
                Node temp=pq.poll();
                if(i==size-1)
                    temp.nextRight=null;
                else
                temp.nextRight=pq.peek();
            if(temp.left!=null)
                pq.add(temp.left);
            if(temp.right!=null)
                pq.add(temp.right);
            
        }
        }
        
    }
}
