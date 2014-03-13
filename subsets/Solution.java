public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        if(S.length == 0){
            return result;
        }    
        Arrays.sort(S);
        for(int i=0;i<S.length;i++){
            ArrayList<ArrayList<Integer> > nr = new ArrayList<ArrayList<Integer> >();
            for(ArrayList<Integer> ai:result){
                ArrayList<Integer> newai = new ArrayList<Integer>(ai);
                newai.add(S[i]);
                nr.add(newai);
            }
            for(ArrayList<Integer> t:nr){
                result.add(t);
            }
        }
        return result;
    }
}