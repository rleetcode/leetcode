public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        //merge from back
        int idxA = m-1;
        int idxB = n-1;
        int idxN = m+n-1;
        while(idxA>=0 && idxB>=0){
            if(A[idxA] <= B[idxB]){
                A[idxN] = B[idxB];
                idxB--;
            }else{
                A[idxN] = A[idxA];
                idxA--;
            }   
            idxN--;
        }
        while(idxA>=0){
            A[idxN] = A[idxA];
            idxA--;
            idxN--;
        }
        while(idxB >=0){
            A[idxN] = B[idxB];
            idxB--;
            idxN--;
        }
        return;    
    }
}