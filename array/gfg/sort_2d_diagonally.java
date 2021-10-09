// https://practice.geeksforgeeks.org/problems/diagonal-morning-assembly0028/1/#
class Solution
{
    void diagonalSort(int matrix[][], int n, int m)
    {
         // Lower left diagonal
        int[] a;
        for(int r=1; r<n; r++) {
            // j start from 0
            int j=0;
            int i=r;
            int asize = Math.min(n-i, m);
            a = new int[asize]; // n-i cells in diagonal start from (i,0)
            // Corner case- mat[4][2] -> 'a' is bound to have max 2 items
            
            while(i<n && j<m) {
                a[j] = matrix[i][j];
                j++;
                i++;
            }
            
            Arrays.sort(a);
            i=r;
            j=0;
            while(i<n && j<m) {
                matrix[i][j] = a[j];
                j++;
                i++;
            }
            
        }
        
        
        // Upper right diagonal
        for(int c=1; c<m; c++) {
            // i start from 0
            int i=0;
            int j=c;
            int asize = Math.min(m-j, n);
            a = new int[asize]; // m-j cells in diagonal start from (0,j)
            while(j<m && i<n) {
                a[i] = matrix[i][j];
                j++;
                i++;
            }
            
            // When sorting in descending Arrays.sort() doesn't take premitive data type    
            Arrays.sort(a);
            reverse(a);
            i=0;
            j=c;
            while(j<m && i<n) {
                matrix[i][j] = a[i];
                j++;
                i++;
            }
            
        }
        
    }
    
    void reverse(int[] a) {
        int n = a.length;
        for(int i=0; i<n/2; i++){
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
    }
}
