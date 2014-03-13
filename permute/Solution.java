import java.util.HashSet;

public class Solution {

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(num.length ==0){
    		return result;
    	}    	
    	result.add(new ArrayList<Integer>());
    	
    	for(int i=0;i<num.length;i++){
    	    ArrayList<ArrayList<Integer> > cur = new ArrayList<ArrayList<Integer> >();
    	   // if(result.size()==0){
    	   //     ArrayList<Integer> na = new ArrayList<Integer>();
    	   //     na.add(num[i]);
    	   //     cur.add(na);
    	   // }else{
    	        for(ArrayList<Integer> na:result){
    	           for(int j=0;j<=na.size();j++){
    	               ArrayList<Integer> n = new ArrayList<Integer>(na);
    	               n.add(j,num[i]);
        	           cur.add(n);
    	           }
    	        }
    	    //}
    	    result = new ArrayList<ArrayList<Integer> >(cur);
    	}
    	
    	return result;
    }
}