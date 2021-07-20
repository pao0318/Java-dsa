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








// OR
 Vector<pair<double,int>> v=new Vector<pair<double,int>>();
        for(int i=0;i<n;i++){
            double x=(arr[i].value*1.0)/
