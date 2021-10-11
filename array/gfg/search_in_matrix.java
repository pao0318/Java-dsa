// https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int matrix[][]=new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++)
		        matrix[i][j]=sc.nextInt();
		}
		int target=sc.nextInt();
		int i=0;
		int start=0;
		int j=col-1;
		while(i<row && j>=0){
		    if(matrix[i][j]==target){
		        System.out.println("Found at ("+ i+" "+j+")");
		        break;
		    }
		    else if(matrix[i][j]>target)
		        j--;
		    else if(matrix[i][j]<target)
		        i++;
		}
		if(j==-1)
		    System.out.println("Not Found");
		
		
	}
}
