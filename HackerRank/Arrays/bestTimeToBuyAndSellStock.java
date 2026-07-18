import java.util.*;
class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(minPrice>prices[i])
            {
                minPrice=prices[i];
            }
            int n=prices[i]-minPrice;

            if(maxProfit<n)
            {
                maxProfit=n;
            }
        }
        return maxProfit;
    }
}
class bestTimeTOBuyAndSellStock
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prices[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			prices[i]=sc.nextInt();
		}
	
	System.out.println(Solution.maxProfit(prices));
	}
	
}