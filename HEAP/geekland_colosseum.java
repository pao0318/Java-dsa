// https://practice.geeksforgeeks.org/contest/job-a-thon-exclusive-hiring-challenge-for-amazon-alexa/problems#
class Solution 
{
    long colosseum(int N,int A[]) {
        
        
        PriorityQueue<Integer> left=new PriorityQueue<>();
        
        
        int n=3*N;
        long[]prefix=new long[n];
        long[]suffix= new long[n];
        
        long sum=0;
        
        // For prefix
        for(int i=0;i<n;i++){
            left.offer(A[i]);
            sum+=A[i];
         
            if(left.size()>N)
                sum-=left.poll();
        
            prefix[i]=sum;
            
                
        }
        
        // For suffix
        sum=0;
        PriorityQueue<Integer> right= new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        for(int i=n-1;i>=0;i--){
                right.offer(A[i]);
                sum+=A[i];
            
            if(right.size()>N)
                sum-=right.poll();
           
            suffix[i]=sum;
            
        }
        
        
        long maxi= Long.MIN_VALUE;
        for(int i=(N-1);i<(2*N);i++){
            maxi=Math.max(maxi, prefix[i]-suffix[i+1]);
        }
        return maxi;
        
        
        
        
    }
} 
