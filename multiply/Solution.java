public class Solution {
    public String add(String num1, String num2){
        if(num1 == "0"){
            return num2;
        }else if(num2 == "0"){
            return num1;
        }
        int idx1 = num1.length()-1;
        int idx2 = num2.length()-1;
        int addone = 0;
        String result="";
        while(idx1>=0 && idx2>=0){
            int n1 = (int)(num1.charAt(idx1)-'0');
            int n2 = (int)(num2.charAt(idx2)-'0');
            int r = n1+n2+addone;
            if(r>=10){
                addone = 1;
                r = r-10;
            }else{
                addone = 0;
            }
            result = Integer.toString(r)+result;
            idx1--;
            idx2--;
        }
        String rest=null;
        int restidx = -1;
        if(idx1>=0){
            rest = num1;
            restidx = idx1;
        }else if(idx2>=0){
            rest = num2;
            restidx = idx2;
        }
        while(restidx >= 0){
            int nr = (int)(rest.charAt(restidx)-'0');
            int r = nr + addone;
            if(r>=10){
                addone = 1;
                r = r-10;
            }else{
                addone = 0;
            }
            result = Integer.toString(r)+result;
            restidx--;
        }
        if(addone==1){
            result = "1"+result;
        }
        return result;
    }
    
    public String multiplywithS(String nums, char single){
        if(nums== "0" || single =='0'){
            return "0";
        }
        String result = "";
        int addone = 0;
        for(int idx = nums.length()-1;idx>=0;idx--){
            char numc = nums.charAt(idx);
            int numi = (int)(numc-'0');
            int s = (int)(single -'0');
            int r = s*numi+addone;
            if(r>=10){
                addone = r/10;
                r = r%10;
            }else{
                addone = 0;
            }
            result = Integer.toString(r)+result;
        }
        if(addone!=0){
            result = Integer.toString(addone) + result;
        }
        return result;
    }
    
    public String multiply(String num1, String num2) {
        if(num1 == "0" || num2 == "0"){
            return "0";
        }    
        String result="0";
        if(num2.length()>num1.length()){
            result = num1;
            num1 = num2;
            num2 = result;
            result ="0";
        }
        int tens = 0;
        for(int idx=num2.length()-1;idx>=0;idx--){
            String tmp =  multiplywithS(num1, num2.charAt(idx));
            int zeros = tens;
            while(zeros != 0 && tmp!="0"){
                tmp = tmp+"0";
                zeros -= 1;
            }
            result = add(result,tmp);
            tens +=1;
        }
        return result;
    }
}