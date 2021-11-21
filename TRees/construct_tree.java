import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    
}
class BTree{
    Node root;
    public void insert(int data){
        Node node= new Node(data);
        if(root==null){
            root=node;
            return;
        }
        Node prev=null;
        Node temp=root;
        while (temp!=null){
            if(data<temp.data){
                prev=temp;
                temp=temp.left;
            }
            else if(data>temp.data){
                prev=temp;
                temp=temp.right;
            }
        } 
        if(prev.data>data)
            prev.left=node;
        else    
            prev.right=node;
        
    }
    public void inorder(){
        Node temp=root;
        Stack<Node> stack=new Stack<>();
        while (temp!=null||!stack.isEmpty()){
            if(temp!=null){
                stack.add(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
}


// Driver function

public class Main{
    public static void main(String args[]){
        
        BTree tree=new BTree();
        tree.insert(30);
        tree.insert(50);
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(60);
        tree.inorder();
        
        
        
    }
}

