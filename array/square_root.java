import java.lang.Math.*;
public class Solution {
    public int sqrt(int A) {
   if(A==0)
        return 0;
    
    if(A<4)
        return 1;

    long i=0;
        long ans=0;
    for(i=2;i<=(A/2)+1;i++){
        if((i*i)>=A){
            ans=i-1;
            break;
            }
                    }
        if(i*i==A){
            ans=i;
            }
    return (int)Math.floor(ans);
}
    
    public void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            t--;
            System.out.println(sqrt(n));
        }
    }
}
