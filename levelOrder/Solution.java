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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
        if(root == null){
            return result;
        }
        ArrayList<TreeNode> arraylist = new ArrayList<TreeNode>();
        arraylist.add(root);
        while(arraylist.size()>0){
            ArrayList<TreeNode> temlist = new ArrayList<TreeNode>();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(TreeNode t:arraylist){
                level.add(t.val);
                if(t.left != null){
                    temlist.add(t.left);
                }
                if(t.right != null){
                    temlist.add(t.right);
                }
            }
            result.add(level);
            arraylist = temlist;
            temlist = null;
            level = null;
        }
        return result;
    }
}