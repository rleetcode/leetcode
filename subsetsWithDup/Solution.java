public class Solution {
     public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
         ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
         ArrayList<Integer> temp = new ArrayList<Integer>();
         result.add(temp);
         if(num.length == 0){
             return result;
         }
         Arrays.sort(num);
         dfs(result, temp, num, 0);
         return result;
     }
    
     public void dfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int[] num, int pos){
         for(int i=pos;i<num.length;i++){
             temp.add(num[i]);
             result.add(new ArrayList<Integer>(temp));
             dfs(result,temp,num,i+1);
             temp.remove(temp.size()-1);
             while(i<num.length-1 && num[i] == num[i+1]) i++;
         }
     }
}