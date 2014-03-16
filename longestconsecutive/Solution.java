public class Solution {
    public int longestConsecutive(int[] num) {
        if(num.length <=1){
            return num.length;
        }   
        int max = 1;
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int i:num){
            hashset.add(i);
        }
        for(int i:num){
            int left = i-1;
            int right= i+1;
            int temmax = 1;
            while(hashset.contains(left)){
                temmax++;
                hashset.remove(left);
                left--;
            }
            while(hashset.contains(right)){
                temmax++;
                hashset.remove(right);
                right++;
            }
            max = Math.max(max,temmax);
        }
        return max;
    }
}