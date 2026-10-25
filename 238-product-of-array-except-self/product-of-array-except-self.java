class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        Arrays.fill(answer,1);
        int leftproduct=1;
        int rightproduct=1;
        for(int i=0;i<n;i++){
            int j=n-i-1;
            answer[i]*=leftproduct;
            answer[j]*=rightproduct;
            leftproduct*=nums[i];
            rightproduct*=nums[j];
        }
        return answer;
    }
}