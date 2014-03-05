import java.lang.Math;
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int mindis = Integer.MAX_VALUE;
        int result = target;
        if(num.length<3){
            return result;
        }
        Arrays.sort(num);
        for(int idx=0;idx<num.length-2;idx++){
            int lidx = idx+1;
            int ridx = num.length-1;
            while(lidx < ridx){
                int sum = num[idx] + num[lidx]+num[ridx];
                int dis = Math.abs(sum-target);
                if(dis == 0){
                    return sum;
                }else if(dis < mindis){
                    result = sum;
                    mindis = dis;
                }
                if(sum < target){
                    lidx++;    
                }else if(sum > target){
                    ridx--;
                }
            }
        }
        return result;
    }
}