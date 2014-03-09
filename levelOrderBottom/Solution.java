import java.util.Stack;
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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = ArrayList<ArrayList<Integer>>();
        if(root == null){
            return result;
        }
        
        Stack<ArrayList<TreeNode> > stack = new Stack<ArrayList<TreeNode> >();
        ArrayList<TreeNode> r = new ArrayList<TreeNode>();
        r.add(root);
        stack.push(r);
        
        while(true){
            ArrayList<TreeNode> lastlevel = stack.peek();
            ArrayList<TreeNode> newlevel = new ArrayList<TreeNode>();
            for(TreeNode tree:lastlevel){
                if(tree.left !=null){
                    newlevel.add(tree.left);
                }
                if(tree.right != null){
                    newlevel.add(tree.right);
                }
            }
            if(newlevel.size() == 0){
                break;
            }
            stack.push(newlevel);
        }
        while(!stack.empty()){
            ArrayList<Integer> level = new ArrayList<Integer>();    
            ArrayList<TreeNode> nodes = stack.pop();
            for(TreeNode t:nodes){
                level.add(t.val);
            }
            result.add(level);
        }
        return result;
    }
}