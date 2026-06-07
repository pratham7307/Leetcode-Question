class Solution {
    public int maxProfit(int[] prices) {
        // int n=prices.length;
        // int maxi=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(prices[j]>prices[i]){
        //             maxi=Math.max(maxi,prices[j]-prices[i]);
        //         }
        //     }
        // }
        // return maxi;
        int n=prices.length;
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minprice=Math.min(minprice,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
        }
        return maxprofit;
    }
} 