class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] adjmatrix=new int[n+1][n+1];
        for(int[] relation:trust){
            int a=relation[0];
            int b=relation[1];
            adjmatrix[a][b]=1;
        }
        for(int i=1;i<=n;i++){
            if(isJudge(i,n,adjmatrix)){
                return i;
            }
        }
    return -1;
    }
    public boolean isJudge(int i,int n,int[][] adjmatrix){
        for(int j=1;j<=n;j++){
            if(adjmatrix[i][j]!=0){
               return false;
            }
        }
        for(int row=1;row<=n;row++){
            if(row !=i && adjmatrix[row][i]==0){
                return false;
            }
        }
        return true;
    }
}