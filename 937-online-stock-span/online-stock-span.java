import java.util.*;

class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        if (st.isEmpty()) {
            st.push(new int[]{price, span});
            return span;
        }
        else if (st.size() > 0 && st.peek()[0] > price) {
            st.push(new int[]{price, span});
            return span;
        }
        else if (st.size() > 0 && st.peek()[0] <= price) {

            while (st.size() > 0 && st.peek()[0] <= price) {
                span += st.peek()[1];   
                st.pop();               
            }

            st.push(new int[]{price, span});
            return span;
        }

        return span; 
    }
}