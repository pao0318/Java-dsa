class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        Stack<Integer> stack=new Stack<>();
            int i=0;
            while(i<Math.min(n,m)){
                stack.add(Math.min(arr1[i],arr2[i]));
                if(stack.peek()!=arr1[i])
                    stack.push(arr2[i]);
                else
                    stack.push(arr1[i]);
                i++;    
            }
            if(n<m){
                for(int i=n;i<m;i++)
                    stack.push(arr2[i]);
            }
            else{
                for(int j=m;j<n;j++){
                    stack.push(arr1[i]);
                }
            }
}
