class Solution {
    public void setZeroes(int[][] matrix) {
    List<Integer> rows = new ArrayList<>();
    List<Integer> columns = new ArrayList<>();   
    for(int i =0; i<matrix.length; i ++){
        for(int j =0; j<matrix[0].length; j++){
            if(matrix[i][j] == 0){
                rows.add(i);
                columns.add(j);
            }
        }
    }
    for(int i =0; i< rows.size(); i++){
        int row = rows.get(i);
        for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
        
    }
    for(int j =0; j< columns.size(); j++){
        int col = columns.get(j);
        for (int k = 0; k < matrix.length; k++) {
                matrix[k][col] = 0;}
    }
}}}