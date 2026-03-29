import java.util.Stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            if(st.isEmpty()){
                st.push(curr);
            }else{
                while(!st.isEmpty() && st.peek()>0 && curr<0){
                    if(Math.abs(st.peek()) > Math.abs(curr)){
                        curr=0;
                        break;
                    }else if(Math.abs(st.peek()) == Math.abs(curr)){
                        st.pop();
                        curr=0;
                        break;
                    }else{
                        st.pop();
                    }
                }
                if(curr!=0){
                    st.push(curr);
                }
            }}
        int size = st.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = st.pop();
}
      return result;  
    }
}