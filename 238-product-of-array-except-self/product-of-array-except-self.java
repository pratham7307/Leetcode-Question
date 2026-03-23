class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int leftproduct=1;
        int rightproduct=1;
        int[] answer=new int[n];
        Arrays.fill(answer,1);
        for(int i=0;i<nums.length;i++){
            int j=n-i-1;
            answer[i]*=leftproduct;
            answer[j]*=rightproduct;

            leftproduct*=nums[i];
            rightproduct*=nums[j];
        }
        return answer;
    }
}