class Solution {
    public void rotate(int[][] matrix) {
        int N=matrix.length;
        //Step 1
        //swapping for transpose

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Step 2
        // Reverse the transpose Matrix rows

        for(int row=0; row<N;row++){
            int startCol=0;
            int endCol=N-1;
            while(startCol<=endCol){
                //Swap
                int temp=matrix[row][startCol];
                matrix[row][startCol]=matrix[row][endCol];
                matrix[row][endCol]=temp;
                startCol++;
                endCol--;
            }
        }


    }
}