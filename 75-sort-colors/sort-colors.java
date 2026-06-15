class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(nums[minindex]>nums[j]){
                    minindex=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minindex];
            nums[minindex]=temp;
        }
    }
}