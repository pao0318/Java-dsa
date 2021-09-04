import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int item){
        data=item;
        left=right=null;
    }
}

class Main{
    Node root;
    Main(){
        root=null;
    }
// void inorder(){
//     inorder(root);
// }    

void inorder(){
    if(root==null)
        return;
    Stack<Node> stack=new Stack<>();
    Node curr=root;
    while(!stack.isEmpty() || curr!=null){
        while(curr!=null){
            stack.push(curr);
            curr=curr.left;
        }
        curr=stack.pop();
        System.out.print(curr.data+ " ");
        curr=curr.right;
    }
}
    
   
    
    public static void main(String args[])throws Exception {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }
    
    
}
