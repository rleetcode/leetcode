public class Solution {
    public String strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(hlen == nlen && hlen==0){
            return haystack;
        }
        
        if(nlen==0){
            return haystack;
        }    
        if(hlen==0){
            return null;
        }
        for(int hidx=0;hidx<=hlen-nlen;hidx++){
            boolean match = true;
            for(int nidx=0;nidx<nlen;nidx++){
                if(haystack.charAt(hidx+nidx) != needle.charAt(nidx)){
                    match = false;
                    break;
                }
            }
            if(match){
                return haystack.substring(hidx);
            }
        }
        return null;
    }
}