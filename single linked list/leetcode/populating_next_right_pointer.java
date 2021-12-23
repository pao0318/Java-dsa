// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> pq=new LinkedList();
        pq.add(root);
        while(!pq.isEmpty()){
            int size=pq.size();
            Node last=null;
            while(size-->0){
                Node temp=pq.poll();
                if(temp.left!=null)
                    pq.add(temp.left);
                if(temp.right!=null)
                    pq.add(temp.right);
               
                if(last==null)
                    last=temp;
                else{
                    last.next=temp;
                    last=temp;
                }
                 System.out.print(last);
            }
            
        }
        return root;
    }
}
