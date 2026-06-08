class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        int count=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                count=max;
            }else if(e.getValue()==max){
                count+=max;
            }
        }
        return count;
    }
}