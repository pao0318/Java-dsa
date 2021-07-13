import java.util.*;
public class Main
{
public static String solve(String X, String Y){
    int n=X.length();
    int m=Y.length();
    int[][]dp=new int[n+1][m+1];
    for (int i=0; i<=n; i++){
			for (int j=0; j<=m; j++){
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (X.charAt(i-1) == Y.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		Vector<Character> v=new Vector<>();
		int i = n;
		int j = m;
		while (i > 0 && j > 0){
			if (X.charAt(i-1) == Y.charAt(j-1))
			{
				v.add(X.charAt(i-1));
				i--;
				j--;
			}

			
			else if (dp[i-1][j] > dp[i][j-1]){
			    v.add(X.charAt(i-1));
			    i--;
			}
				
			else{
			    v.add(Y.charAt(j-1));
			    j--;
			}
				
		}
		
		while(i>0){
		    v.add(X.charAt(i-1));
		    i--;
        }
        while(j>0){
		    v.add(Y.charAt(j-1));
		    j--;
        }
            String s3=" ";
            for(int k=v.size()-1;k>=0;k--)
                s3+=v.get(k);
                
        return s3;        
}       



	public static void main(String[] args)throws Exception {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(solve(s,s2));
	}
}
