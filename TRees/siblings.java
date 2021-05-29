class Node{
    int data;
    Node left;
    Node right;
}
class BST{
    public Node createNewNode(int k){
        Node a=new Node();
        a.data=k;
        a.left=null;
        a.right=null;
        return a;
    }
    
    public Node insert(Node node, int val){
        if(node==null)
            return createNewNode(val);
        
        if(val<node.data)
            node.left=insert(node.left,val);
        
        else if(val>node.data)
            node.right=insert(node.right,val);
            
         return node;    
         
    }
    
    public Node getSiblingNode(Node node, int val){
        if(node==null||node.data==val)
            return null;
            
        Node parentNode=null;    
        while(node!=null){
            if(val<node.data){
                parentNode=node;
                node=node.left;
            }
            else if(val>node.data){
                parentNode=node;
                node=node.right;
            }
            else
                break;
        }   
        
        if(parentNode.left!=null &&val==parentNode.left.data)
            return parentNode.right;
            
        if(parentNode.right!=null&&val==parentNode.right.data)
            return parentNode.left;    
            
        return null;
    }
        
    
}
    

public class Main{
    public static void main(String args[]) throws Exception{
        BST a=new BST();
        Node root=null;
        
        root=a.insert(root,8);
        root=a.insert(root,3);
        root=a.insert(root,6);
        root=a.insert(root,10);
        root=a.insert(root,4);
        root=a.insert(root,7);
        root=a.insert(root,1);
        root=a.insert(root,14);
        root=a.insert(root,13);
        
        Node siblingNode= a.getSiblingNode(root,8);
        if(siblingNode!=null)
            System.out.println(siblingNode.data);
        else
            System.out.println("Siblings doesn't exist");
            
        
        
        
    }
}
