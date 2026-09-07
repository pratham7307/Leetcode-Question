class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if (n<=1) {
            return nums;
        }
        int[] temp = new int[n];
        mergesort(nums, 0, n - 1, temp);
        return nums;
    }

    private void mergesort(int[] nums, int low, int high, int[] temp) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(nums, low, mid, temp);
            mergesort(nums, mid + 1, high, temp);
            merge(nums, low, mid, high, temp);
        }
    }

    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;     
        int j = mid + 1;  
        int k = left;   
        while (i <= mid && j <= right) {
            if (nums[i]<=nums[j]) {
                temp[k++]=nums[i++];
            } else {
                temp[k++]=nums[j++];
            }
        }
        while (i<=mid) {
            temp[k++]=nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (int index = left; index <= right; index++) {
            nums[index] = temp[index];
        }
    }
}