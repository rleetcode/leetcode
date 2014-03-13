public class Solution {
    
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        if(digits.length == 0){
            result[0] = 1;
            return result;
        }
        int addone = 1;
        for(int i=digits.length-1;i>=0;i--){
            int temp = addone+digits[i];
            if(temp>=10){
                addone = 1;
                temp = temp -10;
            }else{
                addone = 0;
            }
            result[i+1] = temp;
        }        
        if(addone == 1){
            result[0] = 1;
            return result;
        }else{
            int[] newresult = Arrays.copyOfRange(result,1,result.length);
            return newresult;
        }
    }
}