public class Solution {
    public String addspace(String input, int space){
        String result = input;
        if(space < 0 ){
            result = input.substring(0,input.length()+space);
            
        }else{
            for(int i=0;i<space;i++){
                result+=" ";
            }
        }
        return result;
    }

    public ArrayList<String> fullJustify(String[] words, int L) {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> newline = new ArrayList<String>();
        int size = 0;
        for(int i=0;i<words.length;i++){
            if(size+words[i].length() == L){
                newline.add(words[i]);
                String newstr ="";
                for(int j=0;j<newline.size()-1;j++){
                    newstr = newstr+ newline.get(j) + " ";
                }
                newstr+=newline.get(newline.size()-1);
                result.add(newstr);
                newline.clear();
                size = 0;
            }else if(size+words[i].length() < L){
                newline.add(words[i]);
                size = size+ words[i].length()+1;
            }else{
                i--;
                if(newline.size() == 1){
                    String newstr = addspace(newline.get(0),L-size+1);
                    result.add(newstr);
                }else{
                    int space = newline.size()-1;
                    int leftidx = (L-size+1)%space;
                    int addspace = (L-size+1)/space;
                    String newstr = "";
                    for(int j=0;j<leftidx;j++){
                        newstr += addspace(newline.get(j),addspace+2);
                    }
                    for(int j=leftidx;j<newline.size()-1;j++){
                        newstr += addspace(newline.get(j),addspace+1);
                    }
                    newstr += newline.get(newline.size()-1);
                    result.add(newstr);
                }
                newline.clear();
                size = 0;
            }
        }
        if(!newline.isEmpty()){
            String newstr = "";
            for(String s:newline){
                newstr = newstr+ s + " ";
            }
            newstr = addspace(newstr,L-size);
            result.add(newstr);
        }
        return result;
    }
}