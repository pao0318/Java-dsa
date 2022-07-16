// 
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

class Pair{
    Node node;
    int pos;
    Pair(Node node, int pos){
        this.node=node;
        this.pos=pos;
    }
}
public class TreeTraversal {

    static void alltraversal(Node root,List<Integer>pre,List<Integer>in,List<Integer>post){
        Stack<Pair> stack= new Stack<>();
        stack.push(new Pair(root,1));

        if(root==null)
            return;
        while (!stack.isEmpty()){
            Pair it=stack.pop();

//            Case 1 when it appears for the first time
            if(it.pos==1){
                pre.add(it.node.data);
                it.pos++;
                stack.push(it);
                if(it.node.left!=null){
                    stack.push(new Pair(it.node.left,1));
                }
            }
//            Case 2 when it appears for the second time
            else if(it.pos==2){
                in.add(it.node.data);
                it.pos++;
                stack.push(it);
                if(it.node.right!=null){
                    stack.push(new Pair(it.node.right,1));
                }

            }
            else
                post.add(it.node.data);


        }
    }




    public static void main(String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left=new Node(4);
        root.left.right= new Node(5);

        root.right= new Node(3);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        List<Integer>pre= new ArrayList<>();
        List<Integer>in= new ArrayList<>();
        List<Integer>post= new ArrayList<>();
        alltraversal(root,pre,in,post);
        System.out.println("The preorder Traversal is : ");
        for (int nodeVal: pre) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The inorder Traversal is : ");
        for (int nodeVal: in ) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The postorder Traversal is : ");
        for (int nodeVal: post) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();

    }


}
