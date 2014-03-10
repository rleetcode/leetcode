public class Solution {
    public boolean isValid(String s){
        if(s.length() ==0 )
            return false;
        if(s.length() ==1){
            if(s.equals("0")){
                return false;    
            }
            else{
                return true;
            }    
        }
        if(s.length() ==2){
            if(s.charAt(0) >= '3' || s.charAt(0)=='0'){
                return false;
            }
            int sum = 10*(int)(s.charAt(0)-'0')+(int)(s.charAt(1)-'0');
            if(sum > 26){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public int numDecodings(String s) {
        if(s.length() == 0){
            return 0;
        } 
        int first=0;
        int second=0;
        if(isValid(s.substring(0,1))){
            first = 1;
        }
        if(s.length() == 1){
            return first;
        }
        if(isValid(s.substring(1,2))){
            second = first;
        }
        if(isValid(s.substring(0,2))){
            second++;
        }        
        if(s.length() == 2){
            return second;
        }
        int cur = 0;
        for(int idx=2;idx<s.length();idx++){
            cur =0;
            int brk = 0;
            if(isValid(s.substring(idx,idx+1))){
                cur = second;
            }else{
                brk++;
            }
            if(isValid(s.substring(idx-1,idx+1))){
                cur+=first;
            }else{
                brk++;
            }
            first = second;
            second = cur;
            if(brk ==2 ){
                return 0;
            }
        }
        return cur;
    }
}