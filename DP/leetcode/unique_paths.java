// https://leetcode.com/problems/unique-paths/
import java.util.*;
public class countpaths {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c=sc.nextInt();


        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                arr[i][j]=-1;
        }

        System.out.println(countunique(arr,0,0,r,c));

    }
    public static int countunique(int [][]arr, int i, int j, int r, int c){
        if(i==r-1 && j==c-1)
            return 1;
        if(i>=r || j>=c)
            return 0;
        if(arr[i][j]!=-1)
            return arr[i][j];
        else
            return arr[i][j]=countunique(arr,i+1,j,r,c)+countunique(arr,i,j+1,r,c);

    }
}
