class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int [][] ans = new int [r][c];
    int m = mat.length;
    int n = mat[0].length;
    if(m*n != r*c){
        return mat;
    }
    int row = 0;
    int col = 0;
    for(int i =0; i<m; i++){
        for(int j =0; j<n; j++){
        ans[row][col] = mat [i][j];
        col++;
        if(col == c){
            col = 0;
            row++;
        }             
        }
    }return ans;    
    }
}


class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if(m * n != r * c){
            return mat;
        }

        int[][] ans = new int[r][c];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                int k = i * n + j;

                ans[k / c][k % c] = mat[i][j];
            }
        }

        return ans;
    }
}