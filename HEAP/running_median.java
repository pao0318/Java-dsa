// https://www.codingninjas.com/codestudio/problems/running-median_625409?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=2
import java.util.*;
public class running_median {
    public static void addNumber(int number,PriorityQueue<Integer>left,PriorityQueue<Integer> right){
        if(left.isEmpty() || number<left.peek())
            left.add(number);
        else
            right.add(number);
    }

    public static void rebalance(PriorityQueue<Integer>left,PriorityQueue<Integer> right){
        PriorityQueue<Integer> biggerHeap= left.size()> right.size()?left:right;
        PriorityQueue<Integer> smallerHeap=left.size()>right.size()?right:left;

        if(biggerHeap.size()-smallerHeap.size()>=2){
            smallerHeap.add(biggerHeap.poll());
        }
    }

    public static double getMedian(PriorityQueue<Integer>left,PriorityQueue<Integer> right){
        PriorityQueue<Integer> biggerHeap= left.size()> right.size()?left:right;
        PriorityQueue<Integer> smallerHeap=left.size()>right.size()?right:left;

        if(biggerHeap.size()== smallerHeap.size()){
            return ((double) smallerHeap.peek()+biggerHeap.peek())/2;
        }
        else{
            return biggerHeap.peek();
        }
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();

        PriorityQueue<Integer>left=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> right= new PriorityQueue<>();

        double []median = new double[n];
        for (int i=0;i<n;i++){
            int number=arr[i];
            addNumber(number,left,right);
            rebalance(left,right);
            median[i]=getMedian(left,right);
        }

        for(int i=0;i<n;i++)
            System.out.println(median[i]+" ");

    }

}
