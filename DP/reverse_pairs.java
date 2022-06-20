import java.util.*;
public class reversePairs{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;

       int[]arr= new int[n];
       for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
       System.out.println(countreverse(arr,0,n-1));

    }

    public static int countreverse(int []arr, int l,int r){
        int count=0;
        if(l<r){
            int mid=(l+(r-l)/2);
            count+=countreverse(arr,l,mid);
            count+=countreverse(arr,mid+1,r);

            count+=merge(arr,l,mid,r);
        }
        return count;
    }

    public static int merge(int[]arr, int l, int mid, int r){
        int []left=Arrays.copyOfRange(arr,l,mid+1);
        int[]right=Arrays.copyOfRange(arr,mid+1,r+1);

        int cnt=0;
        int j=mid+1;
        for(int i=l;i<=mid;i++){
          while(j<=r && arr[i]>(2*(long)arr[j]))
              j++;
          cnt+=(j-(mid+1));
      }
        int t1=0;
        int t2=0;
        int k=l;
        while(t1<left.length && t2<right.length){
            if(left[t1]<right[t2])
                arr[k++]=left[t1++];
            else
                arr[k++]=right[t2++];

        }
        while (t1<left.length)
            arr[k++]=left[t1++];
        while (t2<right.length)
            arr[k++]=right[t2++];

        return cnt;


    }

}
