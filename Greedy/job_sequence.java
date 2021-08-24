import java.util.*;
public class Job{
    // Each job has a unique-id,profit and deadline
    char id;
    int deadline, profit;
 
    // Constructors
    public Job() {}
 
    public Job(char id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    // Function to schedule the jobs take 2
    // arguments arraylist and no of jobs to schedule
    void printJobSchedule(ArrayList<Job> arr, int t){
        int n=arr.size();
        
        //Sorting according to decreasing order with profit
        Collections.sort(arr,(a,b)->b.profit-a.profit);
        
    // To keep track of free time slots
        boolean result[] = new boolean[t];
        
    // To store result (Sequence of jobs)
        char job[] = new char[t];    
        
        //iterating through all jobs
        for(int i=0;i<n;i++){
            //free slot then fill
            for(int j=Math.min(t-1,arr.get(i).deadline-1);j>=0;j--){
                
                //free slot found
                if(result[j]==false){
                    result[j]=true;
                    job[j]=arr.get(i).id;
                    break;
                }
            }
        }
        
        for(char jb:job){
            System.out.print(jb+ " ");
        }
        System.out.println();
        
    }
    
    
        public static void main(String args[]){
        ArrayList<Job> arr = new ArrayList<Job>();
 
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        
        // Function call
        System.out.println("Following is maximum " + "profit sequence of jobs");
 
        Job job = new Job();
 
        // Calling function
        job.printJobSchedule(arr, 3);
        
    }
    
        
}





// GFG Approach
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i].deadline);
        }
        int []pro=new int[max+1];
        for(int k=0;k<max+1;k++)
            pro[k]=-1;
            
        int countjob=0;int ans=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(pro[j]==-1){
                    pro[j]=i;
                    countjob++;
                    ans+=arr[i].profit;
                    break;
                }
            }
        }
        int res[]=new int[2];
        res[0]=countjob;
        res[1]=ans;
        return res;
            
    }
}



// Ek aur approach
class Solution
{
      class ItemComparator implements Comparator<Job>{
        public int compare(Job o1, Job o2){
            int n1=o1.profit;
            int n2=o2.profit;
            if(n1<n2) return 1;
            else if(n1>n2) return -1;
            else return 0;
            
        }
    }
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
      Arrays.sort(arr,new ItemComparator());
      
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
            max=Math.max(max,arr[i].deadline);
        
        int[] pro=new int[max+1];
        Arrays.fill(pro,-1);
        
        int nJob=0;
        int totProfit=0;
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(pro[j]==-1){
                    pro[j]=i;
                    nJob++;
                    totProfit+=arr[i].profit;
                    break;
                }
            }
        }
       
        int res[]=new int[2];
        res[0]=nJob;
        res[1]=totProfit;
        return res;
    }
}












