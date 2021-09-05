import java.util.*;

class Node
{
    int data;
    Node left, right;
    public Node(int key)
    {
        data = key;
        left = right = null;
    }
}
 

class Main{
    
    static ArrayList<Integer> list=new ArrayList<>();
    public static void preorder(Node root){
        if(root==null)
            return;
            
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node temp=s.pop();
            list.add(temp.data);
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
            
            
        }
    }
    
   
    public static void main(String args[]) throws Exception{
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        preorder(root);
        for(int k:list)
            System.out.print(k+" ");
    }
}



