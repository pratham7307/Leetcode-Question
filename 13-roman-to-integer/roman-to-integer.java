class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int total=map.get(s.charAt(0));
        for(int i=1;i<n;i++){
            int prev=map.get(s.charAt(i-1));
            int curr=map.get(s.charAt(i));
            if(prev<curr){
                total-=prev;
                total+=(curr-prev);
            }else{
                total+=curr;
            }
        }
        return total;
      }
}