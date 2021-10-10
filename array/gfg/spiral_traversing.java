//https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1# 
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res=new ArrayList<>();
        
        int row_start=0;
        int row_end=r-1;
        int col_start=0;
        int col_end=c-1;
        
        while(row_start<=row_end && col_start<=col_end){
            for(int col=col_start;col<=col_end;col++)
                res.add(matrix[row_start][col]);
            row_start+=1;;
            
            for(int row=row_start;row<=row_end;row++)
                res.add(matrix[row][col_end]);
            col_end--;    
            
            if(row_start<=row_end){
            for(int col=col_end;col>=col_start;col--)
                res.add(matrix[row_end][col]);
            row_end--;  
            }
            
            if(col_start<=col_end){
            for(int row=row_end;row>=row_start;row--)
                res.add(matrix[row][col_start]);
            
            col_start++;
            }
        }
        return res;
        
    }
}
