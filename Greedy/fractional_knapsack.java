class Solution{

double fractionalKnapsack(int W, Item arr[], int n) {
// Your code here

Queue<item> maxHeap = new PriorityQueue<>(new Comparator<item>(){

public int compare(Item item1, Item item2) {

double ratio1 = item1.value / (double )item1.weight;
double ratio2 = item2.value / (double )item2.weight;

return Double.compare(ratio2, ratio1);

}
});

for (int i = 0; i < n; i++) {

maxHeap.add(new Item(arr[i].value, arr[i].weight));

}


int availableSpace = W;
double maxValue = 0;

for (int i = 0; i < n; i++) {

Item item = maxHeap.remove();

if (availableSpace >= item.weight) {

maxValue += item.value;
availableSpace -= item.weight;

} else {

maxValue += (item.value / (double)item.weight) * (double ) availableSpace;
break;

}

}

return maxValue;
}
}








// OR not working but still
 import java.util.Arrays; 
import java.util.Comparator; 
  
public class Main  
{ 
    // function to get maximum value attainable 
    private static double getMaxValue(int[] weights, int[] val, 
                                      int capacity) 
    { 
        WeightValue[] weightValue = new WeightValue[weights.length]; 
        // Populate with the values
        for (int i = 0; i < weights.length; i++) { 
            weightValue[i] = new WeightValue(weights[i], val[i]); 
        } 
  
        // sorting items by value/weight ratio; 
        Arrays.sort(weightValue, new Comparator() { 
            
            public int compare(WeightValue o1, WeightValue o2) 
            { 
                return o2.ratio.compareTo(o1.ratio); 
            } 
        }); 
  
        double totalValue = 0d; 
  
        for (WeightValue i : weightValue) { 
  
            int curWeight = (int)i.weight; 
            int curValue = (int)i.value; 
  
            if (capacity - curWeight >= 0)  
            { 
                // this weight can be picked while 
                capacity = capacity - curWeight; 
                totalValue += curValue; 
            } 
            else 
            { 
                // item cant be picked whole 
                double fraction 
                    = ((double)capacity / (double)curWeight); 
                totalValue += (curValue * fraction); 
                capacity 
                    = (int)(capacity - (curWeight * fraction)); 
                break; 
            } 
        } 
  
        return totalValue; 
    } 
  
    // Weight value class 
    static class WeightValue  
    { 
        Double ratio; 
        double weight, value; 
  
        // item value function 
        public WeightValue(int weight, int value) 
        { 
            this.weight = weight; 
            this.value = value; 
            ratio = new Double((double)value / (double)weight); 
        } 
    } 
    
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] weights = { 10, 20, 30 }; 
        int[] values = { 60, 100, 120 }; 
        int capacity = 50; 
  
        double maxValue = getMaxValue(weights, values, capacity); 
        
        System.out.println("Maximum Value Attainable - "
                           + maxValue); 
    } 
}
