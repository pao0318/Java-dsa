// 
import java.util.*;
public class Segment_Tree {
    static int[]seg;
    static int[]arr;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        arr= new int[n];
        seg=new int[n*4];
        Arrays.fill(seg,0);
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();

       buildsegment(1,0,arr.length-1);
       System.out.println(query(1,0,arr.length-1,x,y));
    }

    private static void buildsegment(int node,int i, int j){
        if(i==j){
            seg[node]=arr[i];
        }
        else {
            int mid = (i + j) / 2;
            int l = (node * 2);
            int r = (node * 2) + 1;
            buildsegment(l, i, mid);
            buildsegment(r, mid + 1, j);
            seg[node] = Math.max(seg[l], seg[r]);
        }
    }

    private static int query(int node,int start, int end,int l,int r){
        if (end < l || r < start) return Integer.MIN_VALUE;

        if(start==end)
            return seg[node];
        else if(l<=start && end<=r)
            return seg[node];
        else{
            int mid=(start+end)/2;
            int left=query(node*2,start,mid,l,r);
            int right=query((node*2)+1,mid+1,end,l,r);
            return Math.max(left,right);
        }
    }
}
