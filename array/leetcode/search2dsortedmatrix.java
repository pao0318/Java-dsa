// https://leetcode.com/problems/search-a-2d-matrix-ii/
import java.util.*;
public class Search_in_sorted{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int target= sc.nextInt();
        int[][]arr= new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
        }

        boolean found=false;
        int lo=0,hi=(r*c-1);
        while(lo<=hi){
            int mid=(lo+(hi-lo)/2);
            if(target>arr[mid/c][mid%c])
                lo=mid+1;
            else if(target<arr[mid/c][mid%c])
                hi=mid-1;
            else{
                found=true;
                break;
            }
        }
        System.out.println(found);


    }



}
