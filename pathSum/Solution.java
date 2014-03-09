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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();     
        if(root == null){
            return result;
        }
        if(root.left ==null && root.right ==null){
            if(root.val == sum){
                ArrayList<Integer> oneresult = new ArrayList<Integer>();
                oneresult.add(0,root.val);
                result.add(oneresult);
            }
            return result;
        }
        if(root.left != null){
            ArrayList<ArrayList<Integer>> left = pathSum(root.left,sum-root.val);
            for(ArrayList<Integer> each:left){
                if(each.size() != 0){
                    each.add(0,root.val);
                    result.add(each);
                }
            }
        }
        if(root.right != null){
            ArrayList<ArrayList<Integer>> right = pathSum(root.right,sum-root.val);
            for(ArrayList<Integer> each:right){
                if(each.size() != 0){
                    each.add(0,root.val);
                    result.add(each);
                }
            }
        }
        return result;
    }
}