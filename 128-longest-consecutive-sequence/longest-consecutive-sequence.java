class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        // int max=1;
        // for(int num:nums){
        //     int count=1;
        //     while(set.contains(num+1)){
        //         count++;
        //         max=Math.max(max,count);
        //         num++;
        //     }
        // }
        // return max;
        int max=1;
       for(int num:set){
        int count=1;
        if(!set.contains(num-1)){
            while(set.contains(num+1)){
                count++;
                num++;
                }  
               max=Math.max(max,count);

        }
       }
        
        return max;
    }
}