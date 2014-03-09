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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = minDepth(root.left);
        }
        if(root.right != null){
            right = minDepth(root.right);
        }
        if(left >0 && right >0){
            return Math.min(left,right)+1;
        }else{
            return Math.max(left,right)+1;
        }
        
    }
}