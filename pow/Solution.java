public class Solution {
    public double powposidx(double x, int n){
        if(n==1){
            return x;
        }else if(x ==1){
            return 1;
        }else{
            double half = powposidx(x,n/2);
            if(n%2 == 0){
                return half*half;
            }else{
                return half*half*x;
            }
        }
    } 
    
    public double pow(double x, int n) {
        if( n==0){
            return 1;
        }
        int xneg = 1;
        if(x == 0){
            return 0;
        }else if(x<0){
            if(n%2 == 0){
                x = -x;
            }else{
                x = -x;
                xneg = -1;
            }
        }
        if(x ==1){
            return x*xneg;
        }
        
        boolean neg = false;
        if(n<0){
            n = -n;
            neg = true;
        }
        double result = powposidx(x,n);
        if(neg){
            result = 1/result;
        }
        return result*xneg;
    }
}