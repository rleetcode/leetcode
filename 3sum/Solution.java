public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
        if(num.length <3){
            return result;
        }
        
        Arrays.sort(num);
        for(int idx=0;idx<num.length-2;idx++){
            if(idx ==0 || num[idx]>num[idx-1]){ //avoid duplication
                int lidx = idx+1;
                int ridx = num.length-1;
                int target = -num[idx];
                while(lidx < ridx ){
                    if(num[lidx]+num[ridx] == target){
                        //found
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(-target);
                        tmp.add(num[lidx]);
                        tmp.add(num[ridx]);
                        result.add(tmp);
                        tmp=null;
                        lidx++;
                        ridx--;
                        while(lidx < ridx && num[lidx-1]==num[lidx]){
                            lidx++;
                        }
                        while(lidx < ridx && num[ridx+1] == num[ridx]){
                            ridx--;
                        }
                    }else if(num[lidx]+num[ridx] < target){
                        lidx++;
                    }else if(num[lidx]+num[ridx] > target){
                        ridx--;
                    }
                }
            }
        }
        return result;
    }
}