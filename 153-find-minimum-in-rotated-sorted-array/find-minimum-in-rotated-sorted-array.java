class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[high]) return nums[low];
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]) return nums[mid];
            else if(nums[low]<=nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}