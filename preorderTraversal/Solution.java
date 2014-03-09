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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        result.add(root.val);
        if(root.left != null){
            result.addAll(preorderTraversal(root.left));        
        }
        if(root.right != null){
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }
}