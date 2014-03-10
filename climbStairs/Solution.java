public class Solution {
    public int climbStairs(int n) {
        if(n <=2){
            return n;
        }    
        int fir = 1;
        int sec = 2;
        int third = 0;
        for(int i=3;i<=n;i++){
            third = fir+sec;
            fir = sec;
            sec = third;
        }
        
        return third;
    }
    
    public int climbStairsDP(int n) {
        if(n <=2){
            if(!steps.containsKey(n)){
                steps.put(n,n);
            }
            return steps.get(n);
        }    
        if(!steps.containsKey(n)){

            steps.put(n, climbStairs(n-1)+climbStairs(n-2));
        }
        
        return steps.get(n);
    }
}