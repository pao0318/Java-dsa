import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.data=key;
        left=right=null;
    }
}
class Main{
    public static void postorder(Node root){
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        
        stack.push(node);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            res.add(temp.data);
            
            if(temp.left!=null)
                stack.push(temp.left);
            if(temp.right!=null)
                stack.push(temp.right);
                
        }
        while(!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
    
    

    
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        postorder(root);
    }
    
    
    
}
