// https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/flood-fill-official/ojquestion
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]arr1=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        boolean[][] visited= new boolean[n][m];
        floodfill(arr1,0,0,"",visited);
    }
    public static void floodfill(int[][]arr, int row, int col, String psf, boolean[][] visited){
        if(row<0||col<0|| row==arr.length|| col==arr[0].length|| arr[row][col]==1||visited[row][col]==true)
            return;
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        floodfill(arr,row-1,col,psf+"t",visited);
        floodfill(arr,row,col-1,psf+"l",visited); 
        floodfill(arr,row+1,col,psf+"d",visited); 
        floodfill(arr,row,col+1,psf+"r",visited); 
        visited[row][col]=false;
    }
}
