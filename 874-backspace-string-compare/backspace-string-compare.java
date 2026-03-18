class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder res = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1); 
                }
            } else {
                res.append(c); 
            }
        }

        return res.toString();
    }
}