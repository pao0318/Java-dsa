import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class LongestLeaf {
    Node root;

    public static void printTopBottom(Node curr, HashMap<Node,Node>parent ){
        Stack<Node> stk=new Stack<>() ;

        // start from leaf node and keep on pushing
        // nodes into stack till root node is reached
        while (curr!=null)
        {
            stk.push(curr);
            curr = parent.get(curr);
        }

        // Start popping nodes from stack and print them
        while (!stk.isEmpty())
        {
            curr = stk.pop();
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }



    public static void getLongest(Node root){
        if (root==null)
            return;
        Stack<Node> stack= new Stack<>();
        stack.push(root);

        HashMap<Node,Node> map= new HashMap<>();
        map.put(root,null);

        while(!stack.isEmpty()){
            Node curr= stack.pop();

            if(curr.left==null && curr.right==null)
                printTopBottom(curr,map);
            if(curr.right!=null){
                map.put(curr.right,curr);
                stack.push(curr.right);
            }
            if(curr.left!=null){
                map.put(curr.left,curr);
                stack.push(curr.left);
            }

        }



    }


    public static  void main(String []args){
        Scanner sc= new Scanner(System.in);
        LongestLeaf tree= new LongestLeaf();
        tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(4);
        getLongest(tree.root);

    }
}
