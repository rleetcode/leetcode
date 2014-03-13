public class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x==0) return 0;
        if(x<0){
            neg = true;
            x = -x;
        }
        int result = 0;
        while(x != 0){
            int d = x%10;
            result = result*10+d;
            x = x/10;
        }
        if(neg){
            return -result;
        }else{
            return result;
        }
        
    }
}