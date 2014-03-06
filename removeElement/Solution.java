public class Solution {
    public int removeElement(int[] A, int elem) {
        if(A.length ==0){
            return 0;
        } 
        int elidx = A.length-1;
        int cnt = A.length;
        for(int idx=A.length-1;idx>=0;idx--){
            if(A[idx] ==elem){
                cnt--;
                A[idx] = A[elidx];
                elidx--;
            }
        }
        return cnt;
    }
}