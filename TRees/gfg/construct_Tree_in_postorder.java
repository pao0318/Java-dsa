// https://practice.geeksforgeeks.org/problems/construct-tree-1/1#
  class Solution
{
    static int idx=0;
    static HashMap<Integer,Integer> map;
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        idx=0;
        map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        Node root=solve(preorder, inorder,0,n-1);
        return root;
        
    }
    public static Node solve(int preorder[], int inorder[], int lower, int upper){
        if(lower>upper)
            return null;
        
        Node res=new Node(preorder[idx++]);
        if(lower==upper)
            return res;
        int mid=map.get(res.data);
        
        res.left=solve(preorder, inorder,lower,mid-1);
        res.right=solve(preorder, inorder,mid+1, upper);
        
        return res;
    }
}
