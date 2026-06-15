class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     int minindex=i;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[minindex]>nums[j]){
        //             minindex=j;
        //         }
        //     }
        //     int temp=nums[i];
        //     nums[i]=nums[minindex];
        //     nums[minindex]=temp;
        // }
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
                
            }else{
                mid++;
            }
        }
    }
}