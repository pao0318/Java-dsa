// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root, int val) {
    //   Tree base=root;
      while(root!=null){
          if(root.val==val)
            return true;
          else if(val<root.val)
            root=root.left;
          else
            root=root.right;    
      }
      return false;
            

    }
}
