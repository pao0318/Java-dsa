/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        Node res= new Node(node.val);
        Node []visited = new Node[101];
        
        copy(node, res,visited);
        return res;
        
    }
    public void copy(Node node, Node res, Node []visited){

        visited[res.val]=res;
        
        for(Node n:node.neighbors){
            if(visited[n.val]==null){
                Node newNode= new Node(n.val);
                res.neighbors.add(newNode);
                copy(n, newNode,visited);
            }
            else{
                res.neighbors.add(visited[n.val]);
            }
        }
    }
}
