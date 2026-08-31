class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum=0;
        int n=candies.length;
        for(int i=0;i<n;i++){
            sum+=candies[i];
        }
        if(sum<k) return 0;
        long low=1,high=sum;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long count=divide(candies,n,mid);
            if(count>=k){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int) ans;
    }
      private long divide(int[] candies,int n,long mid){
            long count=0;
            for(int i=0;i<n;i++){
                count+=candies[i]/mid;
            }
            return count;
        }
}