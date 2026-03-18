import java.util.*;
// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> st = new Stack<>();
//         StringBuilder res = new StringBuilder();

//         for (char c : s.toCharArray()) {
//             if (!st.isEmpty() && st.peek() == c) {
//                 st.pop();
//             } else {
//                 st.push(c);
//             }
//         }

//         while (!st.isEmpty()) {
//             res.append(st.pop());
//         }

//         return res.reverse().toString();
//     }
// }
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = res.length();

            if (len > 0 && res.charAt(len - 1) == c) {
                res.deleteCharAt(len - 1); // remove duplicate
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}