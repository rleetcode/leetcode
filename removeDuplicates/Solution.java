public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length<=1){
            return A.length;
        }
        int newlen = 1;
        
        int noduidx = 0;
        int curidx = 1;
        while(curidx <= A.length-1){
            if(A[noduidx] != A[curidx]){
                noduidx++;
                A[noduidx] = A[curidx];
                newlen++;
            }
            curidx++;
        }
        return newlen;
    }
}