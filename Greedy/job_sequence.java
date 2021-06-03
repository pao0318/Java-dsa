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
