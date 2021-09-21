import java.util.*;

class Solution {
    public boolean solve(int n, int[] seats) {
        int len=seats.length;
    
        for(int i=0;i<seats.length;i++){
            if(n==0)
                break;
                // Yeh starting ka h
            if(i==0){
                if(seats[i]==0 && i==len-1) n--;
                if(seats[i]==0 && i+1<len && seats[i+1]==0){
                    n--;
                    seats[i]=1;
                }
            }
                // Yeh ending ka h
            else if(i==len-1){
                if(seats[i]==0&&seats[i-1]==0)
                    n--;
            }
                // Yeh kahi beech ka
        else{
            if(seats[i]==0 && seats[i-1]==0 && seats[i+1]==0){
                n--;
                seats[i]=1;
            }
        }
        }
        return n==0;
    }
}
