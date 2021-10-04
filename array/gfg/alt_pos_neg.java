// https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1#

class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int x:arr){
            if(x>=0)
                pos.add(x);
            else
                neg.add(x);
        }
        
        int px=pos.size();
        int nx=neg.size();
        int i=0;
        int j=0;
        int k=0;
        while(i<px || j<nx){
            if(i<px){
                arr[k++]=pos.get(i);
                i++;
            }
            if(j<nx){
                arr[k++]=neg.get(j);
                j++;
            }
        }
        
    }
}
