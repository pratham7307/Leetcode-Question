class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0,high=n-1;
        int max=0;
        while(low<high){
            int totalwater=(high-low)*Math.min(height[low],height[high]);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
            if(totalwater>max){
                max=totalwater;
            }
        }
        return max;
    }
}