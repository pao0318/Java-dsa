class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==0){
                    
                    for(int po=1;po<=9;po++){
                       if(isValid(grid,i,j,po)){
                           grid[i][j]=po;
                           if(SolveSudoku(grid))
                                return true;
                            else
                            grid[i][j]=0;
                       }
                    }
                       return false;
          
           
       }
                
}
    }
    return true;
        
    
       
}
    
    
    public static boolean isValid(int[][]grid, int i, int j, int po){
        for(int row=0;row<9;row++){
            if(grid[row][j]==po)
            return false;
        }
        for(int col=0;col<9;col++){
            if(grid[i][col]==po)
            return false;
        }
        
        int xi=(i/3)*3;
        int xj=(j/3)*3;
        
        for(int l=0;l<3;l++){
            for(int m=0;m<3;m++){
                if(grid[l+xi][m+xj]==po)
                    return false;
            }
        }
        return true;
    }
    

    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
