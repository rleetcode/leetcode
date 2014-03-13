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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //stack.push(root);
        TreeNode t = root;
        while(!stack.isEmpty() || t !=null){
            
            if(t!= null){
                stack.push(t);
                t = t.left;
            }else{
                t = stack.pop();
                result.add(t.val);
                t = t.right;
            }
        }
        return result;
    }
}