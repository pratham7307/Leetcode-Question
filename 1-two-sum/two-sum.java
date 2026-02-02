// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] arr=new int[2];
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     arr[0]=i;
//                     arr[1]=j;
//                 }
//             }
//         }
//         return arr;
//     }
// }
 class Solution {
     public int[] twoSum(int[] nums, int target){
        int[] arr=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int moreneeded=target-num;
            if(map.containsKey(moreneeded)){
                arr[0]=map.get(moreneeded);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
     }}