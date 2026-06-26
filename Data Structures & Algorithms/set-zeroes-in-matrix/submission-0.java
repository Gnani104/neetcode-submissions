class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowmap = new HashSet<>();
        Set<Integer> colmap = new HashSet<>();
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col] == 0){
                    rowmap.add(row);
                    colmap.add(col);
                }
            }
        }
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(rowmap.contains(row) || colmap.contains(col)){
                    matrix[row][col] = 0;
                }
        }
        }
    }
}
