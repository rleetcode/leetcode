public class Solution {
    public int atoi(String str) {
        if(str == null){
            return 0;
        }
        str = str.trim();
        if(str.length() ==0){
            return 0;
        }
        boolean neg = false;
        double result = 0;

        int idx=0;
        if(str.charAt(0) == '-'){
            neg = true;
            idx++;
        }else if(str.charAt(0) == '+'){
            idx++;
        }
        
        for(;idx<str.length();idx++){
            char numc = str.charAt(idx);
            if( numc<'0' || numc>'9'){
                return (int)result;
            }
            int num = (int)(numc - '0');
            if(!neg){
                result = result*10 + num;
                if(result >  Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else{
                    continue;
                }
            }else{
                result = result*(10) - num;
                if(result < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }else{
                    continue;
                }
            }
        }
        
        return (int)result;
    }
}