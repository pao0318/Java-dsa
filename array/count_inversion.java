import java.util.*;
public class inversion{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(countinversion(arr,0,n-1));
    }

    public static int countinversion(int[]arr, int l, int r){
        int count=0;
        if(l<r){
            int mid=(l+r)/2;

            count+=countinversion(arr,l,mid);
            count+=countinversion(arr,mid+1,r);

            count+=merge(arr,l,mid,r);

        }
        return count;

    }
    public static int merge(int[]arr, int l, int mid,int r){
        int[]left= Arrays.copyOfRange(arr,l,mid+1);

        int[]right=Arrays.copyOfRange(arr,mid+1,r+1);

        int i=0,j=0,k=l,swaps=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else{
                arr[k++]=right[j++];
                swaps+=mid+1-(l+i);
            }
        }

        while(i<left.length)
            arr[k++]=left[i++];
        while(j<right.length)
            arr[k++]=right[j++];

        return swaps;

    }

}
