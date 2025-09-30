class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            //Traverse the row -> left to right
            for(int i=colBegin;i<= colEnd;i++) {
                matrix[rowBegin][i] = count;
                count++;;
            }
            rowBegin++;
            //Traverse the col -> top to bottom
            for(int i=rowBegin;i<=rowEnd;i++) {
                matrix[i][colEnd]=count;
                count++;;
            }
            colEnd--;
            //Traverse the row -> right to left
            if(rowBegin <= rowEnd) {
                for(int i=colEnd;i>=colBegin;i--) {
                matrix[rowEnd][i]=count;
                count++;
                }
            }
            rowEnd--;
            //Traverse the col -> bottom to top
            if(colBegin <= colEnd) {
                for(int i=rowEnd;i>=rowBegin;i--) {
                matrix[i][colBegin] = count;
                count++;
                }
            }
            colBegin++;
        }
        return matrix;
    }
}