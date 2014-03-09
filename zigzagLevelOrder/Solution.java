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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
        if(root == null){
            return result;
        }
        ArrayList<TreeNode> arraylist = new ArrayList<TreeNode>();
        arraylist.add(root);
        boolean zig=false;
        while(arraylist.size()>0){
            ArrayList<TreeNode> temlist = new ArrayList<TreeNode>();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(TreeNode t:arraylist){
                if(zig){
                    level.add(0,t.val);
                }else{
                    level.add(t.val);
                }
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
            zig = !zig;
        }
        return result;
    }
}