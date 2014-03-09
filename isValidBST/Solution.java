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
    public boolean valid(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.val >= max || root.val <= min){
            return false;
        }
        boolean left = valid(root.left, min , root.val);
        boolean right = valid(root.right,root.val, max);
        return left&&right;
    }
    
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return valid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}