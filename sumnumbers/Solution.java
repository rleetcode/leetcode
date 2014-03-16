/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> sum(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root.left == null && root.right == null){
            ArrayList<Integer> r = new ArrayList<Integer>();
            r.add(root.val);
            result.add(r);
        }

        if(root.left != null){
            ArrayList<ArrayList<Integer>> left = sum(root.left);
            for(ArrayList<Integer> ai:left){
                ArrayList<Integer> nai = new ArrayList<Integer>(ai);
                nai.add(0,root.val);
                result.add(nai);
            }
        }
        if(root.right != null){
            ArrayList<ArrayList<Integer>> right = sum(root.right);
            for(ArrayList<Integer> ai:right){
                ArrayList<Integer> nai = new ArrayList<Integer>(ai);
                nai.add(0,root.val);
                result.add(nai);
            }            
        }
        return result;
    }
    
    public int sumNumbers(TreeNode root) {
        if(root== null){
            return 0;
        }
        int result = 0;
        ArrayList<ArrayList<Integer>> r = sum(root);
        for(ArrayList<Integer> ai:r){
            int tmp = 0;
            for(Integer i:ai){
                tmp = tmp*10 + i;
            }
            result += tmp;
        }
        return result;
    }
}