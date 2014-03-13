public class Solution {
    public void sortColors(int[] A) {
        if(A.length <= 1){
            return;
        }    
        int i = 0;
        int j = A.length-1;
        int cur = 0;
        while(cur <= j){
            if(A[cur] == 1){
                cur++;
                continue;
            }else if(A[cur] == 0){
                if(cur>i){
                    int temp = A[i];
                    A[i] = A[cur];
                    A[cur] = temp;
                    i++;
                }else{
                    i++;
                    cur++;
                }
            }else if(A[cur] == 2){
                int temp = A[j];
                A[j] = A[cur];
                A[cur] = temp;
                j--;
            }
        }
        return;
    }
}