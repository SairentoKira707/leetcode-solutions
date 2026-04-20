// Last updated: 20/04/2026, 15:55:35
class Solution {
    public int maxProfit(int[] prices) {
        int[] a=prices;
        if(a==null||a.length<2){
            return 0;
        }
        int min=a[0], profit=0;
        for(int i=1;i<a.length;i++){
            int cost=a[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,a[i]);
        }
        return profit;
    }
}