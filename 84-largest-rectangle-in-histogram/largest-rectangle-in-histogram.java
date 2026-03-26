class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nsr=new int[n];
        int[] nsl=new int[n];
        Stack<Integer> st=new Stack<>();
        //nsr
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                nsr[i]=n;
            }
            else if(st.size()>0 && heights[st.peek()]<heights[i]){
                nsr[i]=st.peek();
            }
            else{
                while(st.size()>0 && heights[st.peek()]>=heights[i]){
                    st.pop();
                }
                if(st.isEmpty()) nsr[i]=n;
                else{
                    nsr[i]=st.peek();
                }            }
                st.push(i);
        }
        st.clear();
        //nsl
         for(int i=0;i<n;i++){
            if(st.isEmpty()){
                nsl[i]=-1;
            }
            else if(st.size()>0 && heights[st.peek()]<heights[i]){
                nsl[i]=st.peek();
            }
            else{
                while(st.size()>0 && heights[st.peek()]>=heights[i]){
                    st.pop();
                }
                if(st.isEmpty()) nsl[i]=-1;
                else{
                    nsl[i]=st.peek();
                }            }
                st.push(i);
        }
         int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}