class Solution {
    public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     markRow(matrix, i, n);
//                     markColumn(matrix, j, m);
//                 }
//             }
//         }
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == -1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     static void markRow(int[][] matrix, int row, int n) {
//         for (int j = 0; j < n; j++) {
//             if (matrix[row][j] != 0) { 
//                 matrix[row][j] = -1;
//             }
//         }
//     }

//     static void markColumn(int[][] matrix, int col, int m) {
//         for (int i = 0; i < m; i++) {
//             if (matrix[i][col] != 0) { 
//                 matrix[i][col] = -1;
//             }
//         }
//     }
// }
    int m=matrix.length;
    int n=matrix[0].length;
    int[] row=new int[m];
    int[] col=new int[n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(row[i]==1 || col[j]==1){
                matrix[i][j]=0;
            }
        }
    }
    return;
    
    }}