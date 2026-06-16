class Solution {
    public int maxSubArray(int[] nums) {
        // int n=nums.length;
        // int maxi=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         maxi=Math.max(maxi,sum);
        //     }
        // }
        // return maxi;
        int maxsum=nums[0];
        int currsum=0;
        for(int num:nums){
            currsum+=num;
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}