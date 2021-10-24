// https://practice.geeksforgeeks.org/problems/check-if-subtree/1#
class Solution {
    public static boolean isSubtree(Node T, Node S) {
        if(T==null)
            return false;
        if(S==null)
            return true;
        
        if (isSubIdentical(T,S))
            return true;
            
        return isSubtree(T.right,S)||isSubtree(T.left,S);
            
    }
    
    public static boolean isSubIdentical(Node T, Node S){
        
        if(T==null && S==null)
                return true;    
        if(T==null || S==null)
                return false;
        if(T.data!=S.data)
            return false;
            
            
            
            
           return isSubIdentical(T.left,S.left) &&isSubIdentical(T.right,S.right);
    }
}
