class Solution{
    //Function to return list containing elements of right view of binary tree.
     ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> rightView(Node node) {
      
        helper(node,0);
        return list;
    }
    void helper(Node node, int level){
        if(node==null)
            return;
        
        if(list.size()==level){
            list.add(node.data);
        }
        helper(node.right,level+1);
        helper(node.left,level+1);
    }
    
}
