// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int num:nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         int num=-1;
//         for(Map.Entry<Integer,Integer> e:map.entrySet()){
//             if(e.getValue()>1){
//                 num=e.getKey();
//             }
//         }
//         return num;
//     }
// }
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }

        return 0;
        
    }
}