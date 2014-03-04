import java.util.Hashtable;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] returnresult = new int[2];
        if(numbers.length <= 1){
            return returnresult;
        }
        Hashtable<Integer,Integer> iht = new Hashtable<Integer,Integer>();
        for(int li=0;li<numbers.length;li++){
            if(iht.get(numbers[li]) ==null){
                if(iht.get(target-numbers[li]) != null){
                    returnresult[0] = iht.get(target-numbers[li]);
                    returnresult[1] = li+1;
                    break;
                }else{
                    iht.put(numbers[li],li+1); 
                }
            }else if(target == (numbers[li]+numbers[li] )){
                returnresult[0] = iht.get(numbers[li]);
                returnresult[1] = li+1;
                break;
            }
        }
        return returnresult;
    }
}