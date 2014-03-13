public class Solution {

    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> result = new ArrayList<String>();
        if(strs.length<=1){
            return result;
        }
        HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
        for(int i=0;i<strs.length;i++){
            char[] strarray = strs[i].toCharArray();
            Arrays.sort(strarray);
            String sorted = new String(strarray);
            if(hashmap.containsKey(sorted)){
                int idx = hashmap.get(sorted);
                if(idx!= -1){
                    result.add(strs[idx]);
                    result.add(strs[i]);
                    hashmap.put(sorted,-1);
                }else{
                    result.add(strs[i]);
                }
            }else{
                hashmap.put(sorted, i);    
            }
        }
        return result;
    }
}	