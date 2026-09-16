class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=map.size();
        int i=0,j=0;
        int min=n+1;
        int start=0;
        while(j<n){
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }
            if (count > 0) {
                j++;
            }else if(count==0){
                while(count==0){ 
               if(j-i+1<min){
                min=j-i+1;
                start=i;
               }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                    if(map.get(s.charAt(i))>0) count++;
                }
                i++;}
                j++;
            }
        }
         if (min == n + 1) {
            return "";
        }
        return s.substring(start,start+min);
    }
}