class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=findfirst(nums,target,n);
        int last=findlast(nums,target,n);
        return new int[]{first,last};
    }
    private int findfirst(int[] nums,int target,int n){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
        }
        return ans;
    }
    private int findlast(int[] nums,int target,int n){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
        }
        return ans;
    }
}