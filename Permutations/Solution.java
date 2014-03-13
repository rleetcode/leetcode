public class Solution {

	public HashSet<ArrayList<Integer>> perm(int[] num){
		HashSet<ArrayList<Integer>> result = new HashSet<String>();
		if(num.length == 0){
			return result;
		}
		for(int i=0;i<num.length;i++){
			int[] sub = new int[num.length-1];
			for(int j=0;j<num.length-1;){
				if(j==i){
					continue;
				}else{
					sub[j] = num[i];
					j++;
				}
			}
			HashSet<String> subset = perm(sub);
			for(ArrayList<Integer> ain:subset){	
				ain.add(num[i]);
				result.add(ain);
			}
		}
		return result;
	}
	
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(num.length ==0){
    		return result;
    	}    	
    	HashSet<ArrayList<Integer>> temp = perm(num);
    	for(ArrayList<Integer> ain:temp){
    		result.add(ain);
    	}
    	return result;
    }
}