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
        if(root==null)
            return;
        Stack<Node> stack=new Stack();
        Stack<Integer> stack2=new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            
            Node temp=stack.pop();
            stack2.push(temp.data);
            if(temp.left!=null)
                stack.push(temp.left);
            if(temp.right!=null)
                stack.push(temp.right);
                
            
        }
        while(!stack2.isEmpty())
            System.out.print(stack2.pop()+" ");
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
