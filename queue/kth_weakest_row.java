// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length,n=mat[0].length;
        int a[][]=new int[m][2];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)
                    count+=1;
                        }
            a[i][0]=i;a[i][1]=count;
            }
        Arrays.sort(a,(i,j)->i[1]-j[1]);
        int b[]=new int[k];
        for(int i=0;i<k;i++)
            b[i]=a[i][0];

        return b;
}
}
