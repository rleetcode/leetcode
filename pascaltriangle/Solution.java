public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(numRows == 0){
            return result;
        }
        ArrayList<Integer> start = new ArrayList<Integer>();
        start.add(1);
        result.add(start);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> newline = new ArrayList<Integer>();
            newline.add(1);
            ArrayList<Integer> pre = result.get(result.size()-1);
            for(int j=0;j+1<pre.size();j++){
                newline.add(pre.get(j)+pre.get(j+1));
            }
            newline.add(1);
            result.add(newline);
        }
        return result;
    }
}