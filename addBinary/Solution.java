public class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        if(alen == 0){
            return b;
        }else if(blen ==0){
            return a;
        }   
        int addone = 0;
        alen--;
        blen--;
        String result="";
        while(alen>=0 && blen>=0){
            int aint = (int)(a.charAt(alen) - '0');
            int bint = (int)(b.charAt(blen) - '0');
            int ir = aint+bint+addone;
            if(ir == 3){
                addone = 1;
                result = "1"+result;
            }
            else if(ir == 2){
                addone = 1;
                result = "0"+result;
            }else if(ir == 1){
                result = "1"+result;
                addone = 0;
            }else{
                result = "0"+result;
                addone = 0;
            }
            alen--;
            blen--;
        }
        String rest = "";
        int ridx = -1;
        if(alen >=0){
            rest = a;
            ridx = alen;
        }else if(blen >=0){
            rest = b;
            ridx = blen;
        }
        while(ridx>=0){
            int rint = (int)(rest.charAt(ridx) - '0');
            int ir = rint+addone;
            if(ir == 3){
                addone = 1;
                result = "1"+result;
            }
            else if(ir == 2){
                addone = 1;
                result = "0"+result;
            }else if(ir == 1){
                result = "1"+result;
                addone = 0;
            }else{
                result = "0"+result;
                addone = 0;
            }            
            ridx--;
        }
        if(addone == 1){
            result = "1"+result;
        }
        return result;
        
    }
}