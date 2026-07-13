class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder st=new StringBuilder();
        int n=words.length;
        for(int i=n-1;i>=0;i--){
           st.append(words[i]);
           if(i>0){
            st.append(" ");
           }
        }    
        return st.toString();
        }
}