public class Solution {
    
    public boolean isPalindrome(String s) {
        if(s.length() ==0){
            return true;
        }    
        int lidx = 0;
        int ridx = s.length()-1;
        while(lidx < ridx){
            Character lc = s.charAt(lidx);
            Character rc = s.charAt(ridx);
            if( !Character.isLetterOrDigit(lc) ){
                lidx++;
                continue;
            }
            if( !Character.isLetterOrDigit(rc) ){
                ridx--;
                continue;
            }
            String ls = Character.toString(lc);
            String rs = Character.toString(rc);
            if(ls.equalsIgnoreCase(rs)){
                lidx++;
                ridx--;
            }else{
                return false;
            }
        }
        if(lidx==ridx || lidx+1==ridx || ridx+1==lidx){
            return true;
        }else{
            return false;
        }
    }
}