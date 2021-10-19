//https://practice.geeksforgeeks.org/problems/circular-tour/1# 
class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
        if(petrol.length==0|| distance.length==0)
            return -1;
	int bal_fuel=0;
	int def=0;
	int i=0;
	int j=0;
	while(i<petrol.length){
	    bal_fuel+=petrol[i]-distance[i];
	    if(bal_fuel<0){
	        j=i+1;
	        def+=bal_fuel;
	        bal_fuel=0;
	    }
	    
	    i++;
	}
	return (def+bal_fuel)>=0? j:-1;
    }
}
