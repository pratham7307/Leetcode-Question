class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int low=0,high=n-1;
        char res='#';
        while(low<=high){
            int mid=low+(high-low)/2;
            if(letters[mid] == target){
                low=mid+1;
            }else if(letters[mid]<target){
                low=mid+1;
            }else{
                res=letters[mid];
                high=mid-1;
            }
        }
        if(res=='#') return letters[0];
        return res;
    }
}