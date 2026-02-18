class Solution {
    public boolean hasAlternatingBits(int n) {
        int next=0;
        int prev=-1;
        while(n>0){
            next=n%2;
            n/=2;
            if(prev==next) return false;
            prev=next;
        }
        return true;
    }
}