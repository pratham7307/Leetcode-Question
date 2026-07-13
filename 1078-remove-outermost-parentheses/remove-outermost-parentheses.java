class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0) st.append(ch);
                count++;
            }
            else if(ch==')'){
                count--;
                if(count>0) st.append(ch);
            }
        } 
        return st.toString();
    }
}