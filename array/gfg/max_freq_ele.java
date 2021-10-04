// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#
class Solution
{
    static int majorityElement(int a[], int size)
    {
        int n=size;
       int index=0;
       int count=1;
       for(int i=0;i<n;i++){
           if(a[i]==a[index])
                count++;
            else
                count--;
            if(count==0){
                index=i;
                count=1;
            }    
       }
       
       count=0;
       for(int i=0;i<n;i++){
           if(a[i]==a[index])
            count++;
       }
       if(count>n/2)
        return a[index];
        
        return -1;
    }
}
