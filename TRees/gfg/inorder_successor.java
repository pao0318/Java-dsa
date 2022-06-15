class Solution{
 
    public void populateNext(Node root){
            populateNext(root,null);
    }
    
    
    
    public void populateNext(Node root,Node succ){
        if(root==null){
            return;
        }
        populateNext(root.left,root);
        
        
        
        if(root.right!=null){
            Node curr=root.right;
            while(curr.left!=null){
                curr=curr.left;
            }
            root.next=curr;
        }
        else{
            root.next=succ;
        }
        populateNext(root.right,succ);
    }
}
