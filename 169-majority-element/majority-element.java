class Solution {
    public int majorityElement(int[] nums) {
    //    for(int i=0;i<nums.length;i++){
    //       int num=nums[i];
    //       int count=0;
    //       for(int j=0;j<nums.length;j++){
    //         if(nums[j]==num){
    //             count++;
    //         }
    //       }if(count>nums.length/2){
    //          return num;
    //       }
    //    }
    //    return -1; 
    // HashMap<Integer,Integer> map=new HashMap<>();
    // int n=nums.length;
    // for(int i=0;i<n;i++){
    //    map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
    // }
    // for(int key:map.keySet()){
    //     if(map.get(key)>n/2){
    //         return key;
    //     }
    // }
    // return -1;
    //moore's voting law form/2
   
     int count=0,a=0;
     int element=0;
     int n=nums.length;
     for(int i=0;i<n;i++){
        if(count==0){
            element=nums[i];
            count++;
        }else {
            if(nums[i]==element) count++;
            else count--;
        }
     }
     for(int i=0;i<n;i++){
        if(nums[i]==element){
            a++;
        }
        if(a>n/2){
        return element;
     }
     }
     
     return element;
    }
}