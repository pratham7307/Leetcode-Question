class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()) return false;
        // HashMap<Character,Integer> s1=new HashMap<>();
        // HashMap<Character,Integer> t1=new HashMap<>();
        // for(char c:s.toCharArray()){
        //     s1.put(c,s1.getOrDefault(c,0)+1);
        // }
        // for(char c:t.toCharArray()){
        //     t1.put(c,t1.getOrDefault(c,0)+1);
        // }
        // if(s1.equals(t1)) return true;
        // return false;

        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        int j=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for( j=0;j<t.length();j++){
            arr[t.charAt(j)-'a']--;
        }
        for(j=0;j<arr.length;j++){
            if(arr[j]!=0){
                return false;
            }
        }
        return true;
    }
}