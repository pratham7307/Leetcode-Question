class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        int left=0,right=n-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }else if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }
        }
        return arr;
    }
}