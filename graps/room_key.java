
// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public boolean solve(int[][] rooms) {
        int n=rooms.length;
    Set<Integer> roomVisit=new HashSet();
        fortheroom(rooms,roomVisit,0);
        return roomVisit.size()==n;

    }
    void fortheroom(int[][]rooms1, Set<Integer> vis,int curr){
        vis.add(curr);
        for(int i:rooms1[curr]){
            if(!vis.contains(i))
                fortheroom(rooms1, vis,i);
        }
    }
 

    
    }
