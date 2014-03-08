public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length<=2){
            return A.length;
        }
        boolean hitonce = false;
        int newlen = 1;
        int noduidx = 0;
        int curidx = 1;
        while(curidx <= A.length-1){
            if(A[noduidx] == A[curidx]){
                if(hitonce == false){
                    hitonce = true;
                    noduidx++;
                    A[noduidx] = A[curidx];
                    newlen++;
                }
            }else{
                hitonce = false;
                noduidx++;
                A[noduidx] = A[curidx];
                newlen++;                
            }
            curidx++;
        }
        return newlen;
    }
}