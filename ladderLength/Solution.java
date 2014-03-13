public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        if(start.equals(end)){
            return 0;
        }    
        if(dict.size() == 0){
            return 0;
        }
        LinkedList<String> words = new LinkedList<String>();
        LinkedList<Integer> steps = new LinkedList<Integer>();
        words.add(start);
        steps.add(1);
        while(!words.isEmpty()){
            String curword = words.pop();
            int curstep = steps.pop();
            if(curword.equals(end)){
                return curstep;
            }
            
            for(int i=0;i<curword.length();i++){
                char[] newarr = curword.toCharArray();
                for(char c='a';c<='z';c++){
                    newarr[i] = c;
                    String newstr = new String(newarr);
                    
                    // if(c != curword.charAt(i)){
                    //     String newstr="";
                    //     if(i==0){
                    //         newstr = Character.toString(c)+curword.substring(1);
                    //     }else if(i==curword.length()-1){
                    //         newstr = curword.substring(0,curword.length())+Character.toString(c);
                    //     }else{
                    //         newstr = curword.substring(0,i)+Character.toString(c)+curword.substring(i+1,curword.length());
                    //     }
                        if(dict.contains(newstr)){
                            words.add(newstr);
                            steps.add(curstep+1);
                            dict.remove(newstr);
                    //    }
                    }
                }
            }
        }
        return 0;
    }
}