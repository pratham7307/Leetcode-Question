class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            if(st.isEmpty()){
                st.push(curr);
            }else {
                while(st.size()>0 && st.peek()>0 && curr<0){
                if(Math.abs(st.peek())> Math.abs(curr)){
                    curr=0;
                }else if(Math.abs(st.peek())==Math.abs(curr)){
                    curr=0;
                    st.pop();
                }else{
                    st.pop();
                }}
                if(curr!=0){
                    st.push(curr);
                }          }
        }
        int x=st.size();
        int[] arr= new int[x];
        for(int i=x-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}