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

void Morristraversal(){
    
    Node curr,pre;
    curr=root;
    if(root==null)
        return;
        
    while(curr!=null){
        if(curr.left==null){
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
        else{
            pre=curr.left;
            while(pre.right!=null && pre.right!=curr){
                pre=pre.right;
            }
            if(pre.right==null){
                pre.right=curr;
                curr=curr.left;
            }
            else{
                pre.right=null;
                System.out.print(curr.data+" ");
                curr=curr.right;
            }
                
                
        }
    }
    
}
    
   
    
    public static void main(String args[])throws Exception {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.Morristraversal();
    }
    
    
}
