https://www.codingninjas.com/codestudio/problems/975277?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
public class Solution
{
public static int findMinimumCoins(int amount)
    {
       int []coins = new int[]{1, 2, 5, 10, 20, 50, 100, 500, 1000};
    int n=coins.length;
        
    int n_coins=0;
   
        for(int i=n-1;i>=0;i--){
            if(coins[i]>amount)
                continue;
            int ratio=amount/coins[i];
            amount-=coins[i]*ratio;
            n_coins+=ratio;

        }
    return n_coins;
    }
}
