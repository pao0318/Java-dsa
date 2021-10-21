// https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
    
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> list=new ArrayList<>();
	    Queue<Node> pq=new LinkedList<>();
	    pq.add(root);
	    boolean flag=false;
	    while(!pq.isEmpty()){
	           ArrayList<Integer> res=new ArrayList<>();
	        int n=pq.size();
	        while(n-->0){
	            Node temp=pq.poll();
	            res.add(temp.data);
	          
	            if(temp.left!=null)
	            pq.add(temp.left); 
	             if(temp.right!=null)
	            pq.add(temp.right);
	            
	        }
	        if(flag)
	            Collections.reverse(res);
	       for(int i:res)
	        list.add(i);
	        flag=!flag;
	  
	    }
	    return list;
	    
	}
}
