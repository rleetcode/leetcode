public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        rowIndex++;
        if(rowIndex ==0 ){
            return result;
        }
        result.add(1);

        for(int i=1;i<rowIndex;i++){
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j=0;j+1<result.size();j++){
                cur.add(result.get(j)+result.get(j+1));
            }
            cur.add(1);
            result = new ArrayList<Integer>(cur);
        }
        return result;    
    }
}