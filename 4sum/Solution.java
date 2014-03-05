public class Solution {
    public ArrayList<ArrayList<Integer> > threeSum(int[] num, int target){
        ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
        if(num.length <3){
            return result;
        }    
        //no sort, sorted int the 4sum level.
        for(int idx=0;idx<num.length-2;idx++){
            if(idx==0||num[idx]>num[idx-1]){
                int lidx = idx+1;
                int ridx = num.length-1;
                while(lidx < ridx){
                    int sum = num[idx]+num[lidx]+num[ridx];
                    if(sum == target){
                        ArrayList<Integer> found = new ArrayList<Integer>();
                        found.add(num[idx]);
                        found.add(num[lidx]);
                        found.add(num[ridx]);
                        result.add(found);
                        lidx++;
                        ridx--;
                        while(lidx<ridx && num[lidx]==num[lidx-1]){
                            lidx++;
                        }
                        while(lidx<ridx && num[ridx]==num[ridx+1]){
                            ridx--;
                        }
                    }else if(sum < target){
                        lidx++;
                    }else if(sum > target){
                        ridx--;
                    }
                }
            }
        }
        return result;
    }
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
        if(num.length <4){
            return result;
        }
        Arrays.sort(num);
        for(int idx=0;idx<num.length-3;idx++){
            if(idx==0|| num[idx]>num[idx-1]){
                ArrayList<ArrayList<Integer> > resultof3 = threeSum(Arrays.copyOfRange(num,idx+1,num.length),target-num[idx]);
                for(ArrayList<Integer> r3:resultof3){
                    r3.add(0,num[idx]);
                    result.add(r3);
                }
            }
        }
        return result;
    }
}
