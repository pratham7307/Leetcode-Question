class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        int n=words.length;
        reverse(words,0,n-1);
        return s.join(" ",words).toString();
    }
    public void reverse(String[] words,int left,int right){
        while(left<right){
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
    }
}