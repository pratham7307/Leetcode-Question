class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=maxspeed(piles);
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhour=calculatetotalhours(piles,mid);
            if(totalhour<=h){
                ans=mid;
             high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
    private long calculatetotalhours(int[] piles,int speed){
        long totalhour=0;
        for(int num:piles){
           totalhour+=(int)Math.ceil((double)num/speed);
        }
        return totalhour;
    }
    private int maxspeed(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int num:piles){
                if(num>max) {
                    max=num;
                }
        }
        return max;
    }
}