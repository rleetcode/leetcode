public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }    
        int column = matrix[0].length;
        int row = matrix.length;
        boolean[] rowidx = new boolean[row];
        Arrays.fill(rowidx,false);
        boolean[] colidx = new boolean[column];
        Arrays.fill(colidx,false);
        
        for(int idx=0;idx<row;idx++){
            for(int jdx=0;jdx<column;jdx++){
                if(matrix[idx][jdx] ==0){
                    rowidx[idx] =true;
                    colidx[jdx] =true;
                }
            }
        }
        for(int idx=0;idx<row;idx++){
            for(int jdx=0;jdx<column;jdx++){
                if(rowidx[idx]==true || colidx[jdx] ==true){
                    matrix[idx][jdx] =0;
                }
            }
        }
        return;
    }
    
    public void setZeroes2(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }    
        int column = matrix[0].length;
        int row = matrix.length;
        if(row==1 && column ==1){
            return;
        }
        boolean firstrow = false;
        for(int jdx=0;jdx<column;jdx++){
            if(matrix[0][jdx] == 0){
                firstrow = true;
                break;
            }
        }
        boolean firstcol = false;
        for(int idx=0;idx<row;idx++){
            if(matrix[idx][0] == 0){
                firstcol = true;
                break;
            }
        }
        
        for(int idx=1;idx<row;idx++){
            for(int jdx=1;jdx<column;jdx++){
                if(matrix[idx][jdx] ==0){
                    matrix[0][jdx] = 0;
                    matrix[idx][0] = 0;
                }
            }
        }
        for(int idx=1;idx<row;idx++){
            for(int jdx=1;jdx<column;jdx++){
                if(matrix[idx][0]==0 || matrix[0][jdx] ==0){
                    matrix[idx][jdx] =0;
                }
            }
        }
        if(firstrow == true){
            for(int jdx=0;jdx<column;jdx++){
                matrix[0][jdx] = 0;
            }
        }
        if(firstcol == true){
            for(int idx=0;idx<row;idx++){
                matrix[idx][0] = 0;
            }
        }
        
        return;
    }
}